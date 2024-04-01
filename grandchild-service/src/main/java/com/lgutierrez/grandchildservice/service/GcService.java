package com.lgutierrez.grandchildservice.service;

import org.springframework.stereotype.Service;

@Service
public class GcService {
    public String createHi() {
        return "Hi from Grand Child!";
    }
}
