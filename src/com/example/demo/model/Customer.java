package com.example.demo.model;

import java.util.List;
import java.util.Objects;

public class Customer {

    String name;
    String email;

    List<String> phoneNumbers;
    Long salary;

    public Customer() {
    }

    public Customer(String name, String email, List<String> phoneNumbers, Long salary) {
        this.name = name;
        this.email = email;
        this.phoneNumbers = phoneNumbers;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name) && Objects.equals(email, customer.email) && Objects.equals(phoneNumbers, customer.phoneNumbers) && Objects.equals(salary, customer.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, phoneNumbers, salary);
    }
}
