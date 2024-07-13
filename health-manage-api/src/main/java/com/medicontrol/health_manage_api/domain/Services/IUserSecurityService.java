package com.medicontrol.health_manage_api.domain.Services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface IUserSecurityService {
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
