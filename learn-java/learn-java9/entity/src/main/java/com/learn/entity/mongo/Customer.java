package com.learn.entity.mongo;

import java.util.UUID;

public class Customer {

    private String id = UUID.randomUUID().toString();
    private String name;

    public Customer(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
