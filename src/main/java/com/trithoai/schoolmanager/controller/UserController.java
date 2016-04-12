package com.trithoai.schoolmanager.controller;

import com.trithoai.schoolmanager.models.Users;
import com.trithoai.schoolmanager.repositoties.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by johncarter on 09/04/2016.
 */
@Controller
public class UserController {

    @Autowired
    private UsersRepository usersRepository;
    @RequestMapping(value = "/")
    public String index(Model model){
        //usersRepository.saveAndFlush(new Users(2,"do tri thoai", "united"));
        model.addAttribute("lstUsers", usersRepository.findAll());
        model.addAttribute("message","Message from UserController");
        return "index";
    }
}
