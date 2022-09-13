package com.zgui.springbootmicroservices.service;

import com.zgui.springbootmicroservices.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author Mohamed ouokki
 */
@Service
public class CustomerServiceImp implements CustomerService{
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder().customerId(customerId).customerName("ouokki").build();
    }

    @Override
    public CustomerDto saveCustomer(UUID customer_id, CustomerDto customerDto) {
        //todo real implementation
        return null;
    }

    @Override
    public CustomerDto putCustomer(UUID customerId, CustomerDto customerDto) {
        //todo real implementation
        return null;
    }

    @Override
    public void deleteCustomer(UUID customerId) {
        //todo real implementation
    }


}
