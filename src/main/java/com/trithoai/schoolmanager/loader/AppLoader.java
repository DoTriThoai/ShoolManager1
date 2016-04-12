package com.trithoai.schoolmanager.loader;

import com.trithoai.schoolmanager.models.Classss;
import com.trithoai.schoolmanager.models.Student;
import com.trithoai.schoolmanager.repositoties.ClassRepository;
import com.trithoai.schoolmanager.repositoties.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * Created by johncarter on 09/04/2016.
 */
@Component
public class AppLoader implements ApplicationListener<ContextRefreshedEvent> {
    private ClassRepository classRepository;
    private StudentsRepository studentsRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        Classss match = new Classss("Match");
        //classRepository.save(match);
        Student dttStu = new Student("Do Tri Thoai","14/1/1995");
        studentsRepository.save(dttStu);
    }

    @Autowired
    public void setClassRepository(ClassRepository classRepository){
        this.classRepository = classRepository;
    }

    @Autowired
    public void setStudentsRepository(StudentsRepository studentsRepository){
        this.studentsRepository = studentsRepository;
    }
}
