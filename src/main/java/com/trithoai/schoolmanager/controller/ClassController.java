package com.trithoai.schoolmanager.controller;
import com.trithoai.schoolmanager.models.Classss;
import com.trithoai.schoolmanager.repositoties.ClassRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by johncarter on 07/04/2016.
 */
@Controller
public class ClassController {
    
    @Autowired
    private ClassRepository classRepository;
    private final Logger log = LoggerFactory.getLogger(ClassController.class);
    @RequestMapping(value = "/classss")
    public String list(Model model){


        //classRepository.save(new Classss(4,"Japanese"));
       // classRepository.delete(classRepository.findOne(2));

        model.addAttribute("lstClasses", classRepository.findAll());
        //model.addAttribute("oneClass", classRepository.findOne(2));
        model.addAttribute("oneClass", classRepository.findByClassName("Match"));

        model.addAttribute("message","Message from ClassController");
        return "class/list";
    }
}
