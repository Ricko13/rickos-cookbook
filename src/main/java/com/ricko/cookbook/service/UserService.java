package com.ricko.cookbook.service;

import com.ricko.cookbook.model.account.UserRequest;

public interface UserService {

    Long createUser(UserRequest request);

}
