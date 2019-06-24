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
@Table(name = "clientdetails")
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Clientdetails implements Serializable {
    private static final long serialVersionUID = 5243475830416642859L;
    @Id
    @Column(name = "appId", nullable = false, length = 128)
    private String appId;
    @Basic
    @Column(name = "resourceIds", nullable = true, length = 256)
    private String resourceIds;
    @Basic
    @Column(name = "appSecret", nullable = true, length = 256)
    private String appSecret;
    @Basic
    @Column(name = "scope", nullable = true, length = 256)
    private String scope;
    @Basic
    @Column(name = "grantTypes", nullable = true, length = 256)
    private String grantTypes;
    @Basic
    @Column(name = "redirectUrl", nullable = true, length = 256)
    private String redirectUrl;
    @Basic
    @Column(name = "authorities", nullable = true, length = 256)
    private String authorities;
    @Basic
    @Column(name = "access_token_validity", nullable = true)
    private Integer accessTokenValidity;
    @Basic
    @Column(name = "refresh_token_validity", nullable = true)
    private Integer refreshTokenValidity;
    @Basic
    @Column(name = "additionalInformation", nullable = true, length = 4096)
    private String additionalInformation;
    @Basic
    @Column(name = "autoApproveScopes", nullable = true, length = 256)
    private String autoApproveScopes;

}
