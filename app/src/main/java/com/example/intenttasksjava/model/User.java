package com.example.intenttasksjava.model;

import java.io.Serializable;

public class User implements Serializable {
    String name;
    int age;
    public User(String name, int age){
        this.name = name;
        this.age = age;
    }
}
