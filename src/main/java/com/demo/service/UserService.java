package com.demo.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.demo.entity.User;
import com.demo.user.CrmUser;

public interface UserService extends UserDetailsService {

    User findByUserName(String userName);

    void save(CrmUser crmUser);
}
