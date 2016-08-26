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
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("UserService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userDao;

    @Override
    public User getUserById(final int userId) {
        return userDao.selectByPrimaryKey(userId);
    }
}
