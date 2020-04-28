package com.example.demouser.service.implementation;

import com.example.demouser.model.User;
import com.example.demouser.repository.RoleRepository;
import com.example.demouser.repository.UserRepository;
import com.example.demouser.request.UserRequest;
import com.example.demouser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<User> index(String key) {
        return userRepository.findFirsByNameContaining(key);
    }

    @Override
    public User get(String id) {
        return userRepository.getOne(id);
    }

    @Override
    public User save(UserRequest request) {
        User user = User.builder()
                .id(UUID.randomUUID().toString())
                .nama(request.getNama())
                .addres((request.getAddres()))
                .role(roleRepository.getOne(request.getRole()))
                .build();
        return userRepository.save(user);
    }

    @Override
    public User update(UserRequest request, String id) {
        User user = userRepository.getOne(id);
        user.setNama(request.getNama());
        user.setAddres(request.getAddres());
        user.setRole(roleRepository.getOne(request.getRole()));

        return userRepository.save(user);
    }

    @Override
    public String delete(String id) {
        return userRepository.getOne(id) == null ? "user tidak ada" : id + "berhasil di hapus";
    }
}
