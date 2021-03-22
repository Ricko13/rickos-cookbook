package com.ricko.cookbook.service;

import com.ricko.cookbook.model.account.UserMapper;
import com.ricko.cookbook.model.account.UserRequest;
import com.ricko.cookbook.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
//@Transactional
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    private final UserMapper userMapper;


    public Long createUser(UserRequest request) {
        return userRepository
//        userRepository
                .save(userMapper.toEntity(request))
                .getId();
//        return 1L;
    }
}
