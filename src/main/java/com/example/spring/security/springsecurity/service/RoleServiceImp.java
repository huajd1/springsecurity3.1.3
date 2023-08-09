package com.example.spring.security.springsecurity.service;

import com.example.spring.security.springsecurity.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.spring.security.springsecurity.model.Role;


import java.util.List;

@Service
public class RoleServiceImp implements RoleService {
    private final RoleRepository roleRepository;

    @Autowired
    public RoleServiceImp(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }
}
