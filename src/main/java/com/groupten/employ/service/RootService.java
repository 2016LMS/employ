package com.groupten.employ.service;

import org.springframework.stereotype.Service;

@Service
public interface RootService {
    public String authenticateRoot(String root_username,String root_password);
}
