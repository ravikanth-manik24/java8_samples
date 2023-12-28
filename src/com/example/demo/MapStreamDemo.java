package com.example.demo;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;

import java.util.List;

public class MapStreamDemo {
    public static void main(String[] args) {
        List<Customer> customers = new CustomerService().getCustomers();
        customers.stream().forEach((customer) -> 
                customer.getPhoneNumbers().stream().forEach((phone) -> System.out.println("phone = " + phone)));
        
    }
}
