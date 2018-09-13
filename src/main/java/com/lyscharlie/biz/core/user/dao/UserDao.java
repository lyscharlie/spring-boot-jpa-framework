package com.lyscharlie.biz.core.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lyscharlie.biz.core.user.domain.UserDO;

public interface UserDao extends JpaRepository<UserDO, Long> {

}
