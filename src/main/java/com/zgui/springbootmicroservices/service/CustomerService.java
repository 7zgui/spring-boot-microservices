package com.zgui.springbootmicroservices.service;

import com.zgui.springbootmicroservices.web.model.CustomerDto;

import java.util.UUID;

/**
 * @author Mohamed ouokki
 */
public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);

    CustomerDto save(UUID customer_id, CustomerDto customerDto);
}
