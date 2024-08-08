package org.example.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.example.dto.User;
import org.example.entity.UserEntity;
import org.example.repository.UserRepository;
import org.example.service.UserService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ObjectMapper mapper;
    @Override
    public boolean login(User user) {
        return false;
    }

    @Override
    public String register(User user) {
        UserEntity userEntity = mapper.convertValue(user, UserEntity.class);
        userRepository.save(userEntity);
        return "OK";
    }
}
