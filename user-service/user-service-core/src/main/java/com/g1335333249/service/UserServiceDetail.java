package com.g1335333249.service;

import com.g1335333249.entity.User;
import com.g1335333249.exception.UserLoginException;
import com.g1335333249.model.JWT;
import com.g1335333249.model.UserLoginDTO;
import com.g1335333249.repository.UserRepository;
import com.g1335333249.util.BPwdEncoderUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author guanpeng
 * @date 2019-06-24 18:04
 */
@Service
public class UserServiceDetail {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AuthServiceClient client;

    public User insertUser(String username, String  password){
        User user=new User();
        user.setUsername(username);
        user.setPassword(BPwdEncoderUtil.BCryptPassword(password));
        return userRepository.save(user);
    }

    public UserLoginDTO login(String username, String password) {
        // 查询数据库
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UserLoginException("error username");
        }

        if(!BPwdEncoderUtil.matches(password,user.getPassword())){
            throw new UserLoginException("error password");
        }

        // 从auth-service获取JWT
        JWT jwt = client.getToken("Basic dXNlci1zZXJ2aWNlOjEyMzQ1Ng==", "password", username, password);
        if(jwt == null){
            throw new UserLoginException("error internal");
        }

        UserLoginDTO userLoginDTO=new UserLoginDTO();
        userLoginDTO.setJwt(jwt);
        userLoginDTO.setUser(user);
        return userLoginDTO;
    }
}
