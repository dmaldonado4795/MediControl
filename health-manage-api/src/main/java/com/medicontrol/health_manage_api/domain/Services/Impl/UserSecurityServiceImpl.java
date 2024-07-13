package com.medicontrol.health_manage_api.domain.Services.Impl;

import com.medicontrol.health_manage_api.domain.Services.IUserSecurityService;
import com.medicontrol.health_manage_api.domain.Services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserSecurityServiceImpl implements IUserSecurityService, UserDetailsService {

    private final IUserService userService;

    @Autowired
    public UserSecurityServiceImpl(IUserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        var dao = userService.getUserByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User not found: " + username));
        return User.withUsername(dao.getUsername()).password(dao.getPassword()).disabled(!dao.isEnabled()).build();
    }
}