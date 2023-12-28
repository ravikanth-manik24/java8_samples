package com.example.demo.dao;

import com.example.demo.model.Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerDAO {
    List<Customer> customers = new ArrayList<>();

    public CustomerDAO() {
        customers.add(new Customer("John Miller", "john.m@gmail.com", Arrays.asList("1223", "5654661"), 65000l));
        customers.add(new Customer("Kerry", "kerry.n@gmail.com", Arrays.asList("12234", "5654662"), 75000l));
        customers.add(new Customer("Ram Verma", "ram.verma@gmail.com", Arrays.asList("12235", "5654663"), 55000l));
        customers.add(new Customer("Gopal G", "gopal.g@gmail.com", Arrays.asList("12236", "5654664"), 60000l));
        customers.add(new Customer("Jeevan R", "jeevan.rm@gmail.com", Arrays.asList("12237", "5654665"), 90000l));
    }

    public List<Customer> getCustomers() {
        return customers;
    }
}
