package com.example.demo;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;

import java.util.Comparator;
import java.util.List;

public class CustomComparator {
    public static void main(String[] args) {

        List<Customer> customers = new CustomerService().getCustomers();

        System.out.println("************************");
        System.out.println("Customer name before sort");
        System.out.println("************************");


        customers.stream().forEach((customer -> System.out.println("Name : " + customer.getName())));

        //*******************
        //Lambda expression
        //*******************
        Comparator<Customer> nameComparator = (o1, o2) -> o1.getName().compareTo(o2.getName());

        //*******************
        // custom comparator
        //*******************

//        Comparator<Customer> nameComparator = new Comparator<Customer>() {
//            @Override
//            public int compare(Customer o1, Customer o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        };

        //*******************
        // anonymous inline method implementaion
        //*******************

//        Collections.sort(customers, new Comparator<Customer>(){
//
//            @Override
//            public int compare(Customer o1, Customer o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });

        //*******************
        // applying comparator
        //*******************

       // Collections.sort(customers, nameComparator);

        //        customers.stream().sorted(nameComparator).
        //                forEach((c) -> System.out.println("Name: "+ c.getName()));

        System.out.println("************************");
        System.out.println("Customer name after sort");
        System.out.println("************************");

        customers.stream().sorted(Comparator.comparing(Customer::getName)).
                forEach((customer) -> System.out.println("customer = " + customer.getName()));

    }
}
