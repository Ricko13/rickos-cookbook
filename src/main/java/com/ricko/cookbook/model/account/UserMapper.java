package com.ricko.cookbook.model.account;

import com.ricko.cookbook.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(UserRequest request);

}
