package com.example.spring.security.springsecurity.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.spring.security.springsecurity.model.Role;
import com.example.spring.security.springsecurity.model.User;
import com.example.spring.security.springsecurity.repository.RoleRepository;
import com.example.spring.security.springsecurity.service.UserService;

import javax.annotation.PostConstruct;
import java.util.Collections;

@Component
public class Init {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleRepository roleRepository;

    @PostConstruct
    public void init() {
        Role role = new Role("ROLE_USER");
        roleRepository.save(role);

        User user = new User();
        user.setName("user");
        user.setSurname("gg");
        user.setPassword("100");
        user.setRoles(Collections.singletonList(role));
        userService.addUser(user);

        Role role1 = new Role("ROLE_ADMIN");
        roleRepository.save(role1);

        User user1 = new User();
        user1.setName("admin");
        user1.setSurname("gg");
        user1.setPassword("100");
        user1.setRoles(Collections.singletonList(role1));
        userService.addUser(user1);
    }
}
