package com.g1335333249.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author guanpeng
 * @date 2019-06-24 18:05
 */
public class BPwdEncoderUtil {
    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public static String BCryptPassword(String password){
        return encoder.encode(password);
    }

    public static boolean matches(CharSequence rawPassword, String encodedPassword){
        return encoder.matches(rawPassword,encodedPassword);
    }
}
