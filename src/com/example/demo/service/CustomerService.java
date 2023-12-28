package com.example.demo.service;

import com.example.demo.dao.CustomerDAO;
import com.example.demo.model.Customer;

import java.util.List;

public class CustomerService {

    public CustomerService() {
    }

    public List<Customer> getCustomers() {
        CustomerDAO customerDAO = new CustomerDAO();
        return customerDAO.getCustomers();
    }
}
