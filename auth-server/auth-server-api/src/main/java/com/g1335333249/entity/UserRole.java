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
@Table(name = "user_role")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class UserRole implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Basic
    @Column(name = "user_id", nullable = false)
    private long userId;
    @Basic
    @Column(name = "role_id", nullable = false)
    private long roleId;
}
