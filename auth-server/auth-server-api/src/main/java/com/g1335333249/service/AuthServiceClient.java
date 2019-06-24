package com.g1335333249.service;

import com.g1335333249.fallback.AuthServiceHystrix;
import com.g1335333249.model.JWT;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author guanpeng
 * @date 2019-06-24 18:32
 */
@FeignClient(value = "auth-server", fallback = AuthServiceHystrix.class)
public interface AuthServiceClient {
    @PostMapping("/oauth/token")
    JWT getToken(@RequestHeader("Authorization") String authorization,
                 @RequestParam("grant_type") String type,
                 @RequestParam("username") String username,
                 @RequestParam("password") String password);
}
