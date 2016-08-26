// Copyright (c) 1998-2016 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.17
// ============================================================================
// CHANGE LOG
// CNT.5.0 : 2016-08-01, GenForm
// ============================================================================
package com.core.newbie.mapper;

import com.core.newbie.model.User;

public interface UserMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
