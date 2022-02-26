package com.example.hw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HwApplication {

    public static void main(String[] args) {
        SpringApplication.run(HwApplication.class, args);


        System.out.println("Hello1");
        Test t = new Test();
        t.setFirstName("abc");
        t.setLastName("def");
        t.setSalary("12345");
        System.out.println(t.toString());
    }
}
