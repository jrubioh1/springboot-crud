package com.jorge.curso.springboot.app.springboot_crud.servicies;

import java.util.List;


import com.jorge.curso.springboot.app.springboot_crud.entities.User;


public interface UserService {

    List<User> findAll();
    User save(User user);


}
