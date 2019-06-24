package com.g1335333249.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author guanpeng
 * @date 2019-06-24 17:01
 */
@Entity
@Table(name = "oauth_access_token")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class OauthAccessToken implements Serializable {
    private static final long serialVersionUID = -4300161050614789347L;
    @Basic
    @Column(name = "token_id", nullable = true, length = 256)
    private String tokenId;
    @Basic
    @Column(name = "token", nullable = true)
    private byte[] token;
    @Id
    @Column(name = "authentication_id", nullable = false, length = 128)
    private String authenticationId;
    @Basic
    @Column(name = "user_name", nullable = true, length = 256)
    private String userName;
    @Basic
    @Column(name = "client_id", nullable = true, length = 256)
    private String clientId;
    @Basic
    @Column(name = "authentication", nullable = true)
    private byte[] authentication;
    @Basic
    @Column(name = "refresh_token", nullable = true, length = 256)
    private String refreshToken;

}
