package com.trithoai.schoolmanager.repositoties;

import com.trithoai.schoolmanager.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by johncarter on 09/04/2016.
 */
@Transactional
public interface StudentsRepository extends JpaRepository<Student,Integer>{
    List<Student> findAll();
}
