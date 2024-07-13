package com.medicontrol.health_manage_api.domain.Services.Impl;

import com.medicontrol.health_manage_api.domain.DAOs.UserDAO;
import com.medicontrol.health_manage_api.domain.Repositories.UserRepository;
import com.medicontrol.health_manage_api.domain.Services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Optional<UserDAO> getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
