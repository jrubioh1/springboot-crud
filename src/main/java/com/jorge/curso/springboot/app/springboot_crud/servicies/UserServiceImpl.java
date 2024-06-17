package com.jorge.curso.springboot.app.springboot_crud.servicies;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jorge.curso.springboot.app.springboot_crud.entities.User;
import com.jorge.curso.springboot.app.springboot_crud.entities.Role;
import com.jorge.curso.springboot.app.springboot_crud.repositories.RoleRepository;
import com.jorge.curso.springboot.app.springboot_crud.repositories.UserRepository;



@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;
    @Autowired
    private RoleRepository roleRepository;
    
    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    @Transactional(readOnly = true)
    public List<User> findAll() {

        return (List<User>)repository.findAll();
        
    }

    @Override
    @Transactional
    public User save(User user) {

        Optional<Role> optionalRolUser= roleRepository.findByName("ROLE_USER");
        List<Role> roles= new ArrayList<>();
        optionalRolUser.ifPresent(roles::add);

        if(user.isAdmin()){
            Optional<Role> optionalRoleAdmin= roleRepository.findByName("ROLE_ADMIN");
            optionalRoleAdmin.ifPresent(roles::add);
        }
        user.setRoles(roles);

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return repository.save(user);

    }

}