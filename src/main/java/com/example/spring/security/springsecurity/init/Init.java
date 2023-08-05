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
        user.setFirstname("user");
        user.setLastname("gg");
        user.setAge(34L);
        user.setEmail("user@gmail.com");
        user.setPassword("100");
        user.setRoles(Collections.singletonList(role));
        userService.addUser(user);

        Role role1 = new Role("ROLE_ADMIN");
        roleRepository.save(role1);

        User user1 = new User();
        user1.setFirstname("admin");
        user1.setLastname("gg");
        user1.setAge(19L);
        user1.setEmail("user1@gmail.com");
        user1.setPassword("100");
        user1.setRoles(Collections.singletonList(role1));
        userService.addUser(user1);
    }
}
