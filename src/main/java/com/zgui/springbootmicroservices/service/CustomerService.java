package com.zgui.springbootmicroservices.service;

import com.zgui.springbootmicroservices.web.model.CustomerDto;

import java.util.UUID;

/**
 * @author Mohamed ouokki
 */
public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);

    CustomerDto saveCustomer(UUID customer_id, CustomerDto customerDto);

    CustomerDto putCustomer(UUID customerId, CustomerDto customerDto);

    void deleteCustomer(UUID customerId);
}
