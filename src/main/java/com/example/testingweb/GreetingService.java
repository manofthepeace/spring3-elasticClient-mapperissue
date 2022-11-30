package com.example.testingweb;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public MyEntity greet() {
        MyEntity ent = new MyEntity();
        ent.setTest("Test");
        return ent;
    }
}
