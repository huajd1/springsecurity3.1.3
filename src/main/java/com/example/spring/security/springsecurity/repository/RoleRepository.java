package com.example.spring.security.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.spring.security.springsecurity.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
