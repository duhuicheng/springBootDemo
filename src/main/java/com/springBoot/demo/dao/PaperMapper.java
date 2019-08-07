package com.springBoot.demo.dao;


import java.util.List;

import com.springBoot.demo.pojo.Paper;
import org.springframework.stereotype.Repository;

@Repository
public interface PaperMapper {
    List<Paper> selectByMap();
}