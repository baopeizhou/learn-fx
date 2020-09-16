package org.bob.learn.service.impl;

import org.bob.learn.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    private static final String DEFAULT_USERNAME = "baopeizhou";

    private static final String DEFAULT_PASSWORD = "mm123456";

    @Override
    public boolean auth(String username, String password) {
        return DEFAULT_USERNAME.equals(username)&&DEFAULT_PASSWORD.equals(password);
    }
}
