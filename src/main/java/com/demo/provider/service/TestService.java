package com.demo.provider.service;

import com.demo.provider.entity.result.User;

public interface TestService {
    String getMyName();

    void insertUser(User user);
}
