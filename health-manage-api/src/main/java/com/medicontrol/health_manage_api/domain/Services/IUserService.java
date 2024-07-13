package com.medicontrol.health_manage_api.domain.Services;

import com.medicontrol.health_manage_api.domain.DAOs.UserDAO;

import java.util.Optional;

public interface IUserService {
    Optional<UserDAO> getUserByUsername(String Username);
}
