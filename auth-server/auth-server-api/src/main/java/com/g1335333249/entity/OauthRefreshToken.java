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
 * @date 2019-06-24 17:02
 */
@Entity
@Table(name = "oauth_refresh_token")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class OauthRefreshToken implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Basic
    @Column(name = "token_id", nullable = true, length = 256)
    private String tokenId;
    @Basic
    @Column(name = "token", nullable = true)
    private byte[] token;
    @Basic
    @Column(name = "authentication", nullable = true)
    private byte[] authentication;
}
