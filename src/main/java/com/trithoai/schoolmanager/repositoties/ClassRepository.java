package com.trithoai.schoolmanager.repositoties;

import com.trithoai.schoolmanager.models.Classss;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by johncarter on 07/04/2016.
 */
@Transactional
public interface ClassRepository extends JpaRepository<Classss, Integer> {
    List<Classss> findAll();
    @Query("select u from Classss u where u.class_name = ?1")
    Classss findByClassName(String className);

    Classss save(Classss classss);

}
