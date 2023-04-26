package com.demo.provider.service.impl;

import com.demo.provider.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public String getMyName() {
        return "i am provider";
    }
}
