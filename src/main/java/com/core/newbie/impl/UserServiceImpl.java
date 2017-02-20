// Copyright (c) 1998-2016 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2016-08-26, derrick.liang, creation
// ============================================================================
package com.core.newbie.impl;

import com.core.newbie.mapper.UserMapper;
import com.core.newbie.model.User;
import com.core.newbie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    private UserMapper userMapper;

    public UserMapper getUserMapper() {
        return userMapper;
    }

    @Autowired
    public void setUserMapper(final UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User getUserById(final int userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public void insetUser(final User user) {
        userMapper.insert(user);
    }
}
