package com.example.demouser.service;

import com.example.demouser.model.User;
import com.example.demouser.request.UserRequest;

import java.util.List;

public interface UserService {
    List<User> index (String key);
    User get(String id);
    User save(UserRequest request);
    User update(UserRequest request, String id);
    String delete(String id);
}
