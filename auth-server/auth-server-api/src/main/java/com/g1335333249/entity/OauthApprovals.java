package com.g1335333249.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author guanpeng
 * @date 2019-06-24 17:01
 */
@Entity
@Table(name = "oauth_approvals", schema = "spring-cloud-oauth", catalog = "")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class OauthApprovals implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Basic
    @Column(name = "userId", nullable = true, length = 256)
    private String userId;
    @Basic
    @Column(name = "clientId", nullable = true, length = 256)
    private String clientId;
    @Basic
    @Column(name = "scope", nullable = true, length = 256)
    private String scope;
    @Basic
    @Column(name = "status", nullable = true, length = 10)
    private String status;
    @Basic
    @Column(name = "expiresAt", nullable = true)
    private Timestamp expiresAt;
    @Basic
    @Column(name = "lastModifiedAt", nullable = true)
    private Timestamp lastModifiedAt;

}
