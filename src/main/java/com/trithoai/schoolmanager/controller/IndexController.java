package com.trithoai.schoolmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by johncarter on 07/04/2016.
 */
@Controller
public class IndexController {
    @RequestMapping(value = "/abc")
    public String index(Model model){
        model.addAttribute("message","Message from IndexController");
        return "indexssssss";
    }
}
