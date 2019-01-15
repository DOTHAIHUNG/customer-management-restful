package com.hk3t.cms.service;

import com.hk3t.cms.model.Customer;

import java.util.List;

public interface CustomerService {
    List <Customer> findAll();

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);
}
