package com.classicmodels.resources;

import com.classicmodels.model.Customer;
import com.classicmodels.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;

public class CustomerResource {

    @Autowired
    CustomerService customerService;

    @RequestMapping ("/customer")
    public ArrayList<Customer> allCustomers(){
        return customerService.getAllCustomers();
    }

    public Customer customerByNumber(
            @RequestParam(value="customerNumber", defaultValue="1") int No){
        return customerService.getCustomerByNo(No);
    }
}
