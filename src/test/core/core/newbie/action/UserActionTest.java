// Copyright (c) 1998-2016 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2016-08-26, derrick.liang, creation
// ============================================================================
package core.core.newbie.action;

import com.alibaba.fastjson.JSON;
import com.core.newbie.model.User;
import com.core.newbie.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring-mybatis.xml"})
public class UserActionTest {
    private static final Logger logger = Logger.getLogger(UserActionTest.class);
    @Resource
    private final UserService userService = null;

    @Test
    public void test1 () {
        final User user = userService.getUserById(1);
        logger.info(JSON.toJSON(user));
    }
}
