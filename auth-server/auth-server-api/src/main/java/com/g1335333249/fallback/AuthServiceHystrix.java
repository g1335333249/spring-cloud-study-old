package com.g1335333249.fallback;

import com.g1335333249.model.JWT;
import com.g1335333249.service.AuthServiceClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author guanpeng
 * @date 2019-06-24 18:33
 */
@Component
@Slf4j
public class AuthServiceHystrix implements AuthServiceClient {

    @Override
    public JWT getToken(String authorization, String type, String username, String password) {
        log.warn("Fallback of getToken is executed");
        return null;
    }
}
