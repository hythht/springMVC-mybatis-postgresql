// Copyright (c) 1998-2016 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2016-08-26, derrick.liang, creation
// ============================================================================
package com.core.newbie.controller;

import com.alibaba.fastjson.JSON;
import com.core.newbie.model.User;
import com.core.newbie.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/static/user")
public class UserController {
    Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/showUser")
    public String showUser(final HttpServletRequest request, final Model model) {
        final int userId = Integer.parseInt(request.getParameter("id"));
        final User user = userService.getUserById(userId);
        model.addAttribute("user", user);
        logger.debug("running in UserController.java -> showUser()");
        logger.info(JSON.toJSON(request.getRequestURI()));
        logger.info(JSON.toJSON(user));
        return "/user/showUser.html";
    }
}
