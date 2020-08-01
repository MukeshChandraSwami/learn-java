package com.learn.controllers;

import com.learn.entity.mongo.Customer;

public class CustomerController {

    public static void main(String[] args) {

        Customer customer = new Customer("Mukesh");

        System.out.println("Name of customer is :- " + customer.getName());
    }
}
