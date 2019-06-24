package com.g1335333249.repository;

import com.g1335333249.entity.OauthCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import javax.transaction.Transactional;

/**
 * @author guanpeng
 * @date 2019-06-24 17:25
 */
@Transactional(rollbackOn = Exception.class)
public interface OauthCodeRepository extends JpaRepository<OauthCode, Long>, JpaSpecificationExecutor<OauthCode> {
}

