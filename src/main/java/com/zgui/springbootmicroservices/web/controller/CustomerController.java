package com.zgui.springbootmicroservices.web.controller;

import com.zgui.springbootmicroservices.service.CustomerService;
import com.zgui.springbootmicroservices.web.model.CustomerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * @author Mohamed ouokki
 */
@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {
    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(value = "/{customerId}")
    ResponseEntity<CustomerDto> getCustomer(@PathVariable("customerId")UUID customerId){
        return new ResponseEntity<>(customerService.getCustomerById(customerId), HttpStatus.OK);
    }

    @PostMapping(value="/{customerId}")
    ResponseEntity<CustomerDto> saveCustomer(@PathVariable("customerId") UUID customer_id,@RequestBody CustomerDto customerDto){
        return new ResponseEntity<>(this.customerService.saveCustomer(customer_id,customerDto),HttpStatus.CREATED);
    }

    @PutMapping(value="/{customerId}")
    ResponseEntity<CustomerDto> putCustomer(@PathVariable(value = "customerId") UUID customerId,CustomerDto customerDto){
        return new ResponseEntity<>(this.customerService.putCustomer(customerId,customerDto),HttpStatus.NO_CONTENT);
    }
    
}
