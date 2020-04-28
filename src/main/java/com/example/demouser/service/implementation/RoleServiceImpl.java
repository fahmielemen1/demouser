package com.example.demouser.service.implementation;

import com.example.demouser.model.Role;
import com.example.demouser.repository.RoleRepository;
import com.example.demouser.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<Role> getAllRole() {
        return roleRepository.findAll();
    }
}
