package com.bankweb.customer.contoller;


import com.bankweb.customer.service.implementation.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {


    @Autowired
    CustomerService customerService;
}
