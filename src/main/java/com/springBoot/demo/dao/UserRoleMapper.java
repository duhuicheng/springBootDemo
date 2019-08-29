package com.springBoot.demo.dao;

import com.springBoot.demo.pojo.UserRole;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRoleMapper {

    List<UserRole> selectByMap();
}
