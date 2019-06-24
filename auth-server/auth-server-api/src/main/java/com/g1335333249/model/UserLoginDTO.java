package com.g1335333249.model;

import com.g1335333249.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author guanpeng
 * @date 2019-06-24 18:35
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class UserLoginDTO {
    private JWT jwt;
    private User user;

}
