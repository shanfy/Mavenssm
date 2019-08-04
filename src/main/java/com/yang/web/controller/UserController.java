package com.yang.web.controller;

import com.yang.po.SsmUser;
import com.yang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.xml.registry.infomodel.User;
import java.util.List;

/**
 * @Author: shanfy
 * @Date: 2019/7/28 14:27
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/userList")
    public String userList(HttpServletRequest request, Model model){
        List<SsmUser> uList = userService.getAllUser();
        model.addAttribute("uList", uList);
        return "userList";
    }

    @RequestMapping("/showUser")
    public String showUser(HttpServletRequest request,Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        SsmUser user = userService.getUserById(userId);
        model.addAttribute("user", user);
        return "showUser";
    }

    @RequestMapping("/addUserUI")
    public String addUserUI(){
        return "addUser";
    }

    @RequestMapping("/addUser")
    public String addUser(HttpServletRequest request, Model model){
        SsmUser user = new SsmUser();
        user.setName(request.getParameter("name")+"");
        user.setPassword(request.getParameter("password")+"");
        user.setAge(request.getParameter("age")+"");
        userService.addUser(user);
        return "redirect:/user/userList";
    }
    @RequestMapping("/index")
    public String toIndex(){
        return "index";
    }
}
