package com.g1335333249.repository;

import com.g1335333249.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.security.core.userdetails.UserDetails;

import javax.transaction.Transactional;

/**
 * @author guanpeng
 * @date 2019-06-24 17:26
 */
@Transactional(rollbackOn = Exception.class)
public interface UserRepository extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {
    User findByUsername(String username);
}

