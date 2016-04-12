package com.trithoai.schoolmanager.controller;

import com.trithoai.schoolmanager.repositoties.ClassRepository;
import com.trithoai.schoolmanager.repositoties.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by johncarter on 09/04/2016.
 */
@Controller
public class StudentController {
    @Autowired
    private StudentsRepository studentsRepository;
    private ClassRepository classRepository;
    @RequestMapping(value = "/student")
    public String list(Model model){
        model.addAttribute("lstStudents", studentsRepository.findAll());
        return "student/list";
    }
}
