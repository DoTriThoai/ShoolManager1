package com.trithoai.schoolmanager.repositoties;

import com.trithoai.schoolmanager.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by johncarter on 09/04/2016.
 */
@Transactional
public interface UsersRepository extends JpaRepository<Users, Integer>{
    List<Users> findAll();
    Users save(Users users);
}
