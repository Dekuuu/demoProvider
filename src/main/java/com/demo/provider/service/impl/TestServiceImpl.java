package com.demo.provider.service.impl;

import com.demo.provider.entity.result.User;
import com.demo.provider.mapper.UsersMapper;
import com.demo.provider.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public String getMyName() {
        return "i am provider";
    }

    @Override
    public void insertUser(User user) {
        usersMapper.insert(user);
    }
}
