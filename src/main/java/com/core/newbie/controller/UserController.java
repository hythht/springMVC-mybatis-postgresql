// Copyright (c) 1998-2016 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2016-08-26, derrick.liang, creation
// ============================================================================
package com.core.newbie.controller;

import com.core.newbie.model.User;
import com.core.newbie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("user")
public class UserController {
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    @Autowired
    public void setUserService(final UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/showUser")
    public String showUser(final HttpServletRequest request, final Model model) {
        final int userId = Integer.parseInt(request.getParameter("id"));
        final User user = userService.getUserById(userId);
        model.addAttribute("user", user);
        return "showUser";
    }
}
