package com.nqcl.api.dao;

import com.nqcl.api.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//注意：别忘了此注解 注入Bean
public interface UserMapper {

    List<User> hello()throws Exception;
}