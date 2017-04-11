package com.classicmodels.resources;

import com.classicmodels.model.Customer;
import com.classicmodels.services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

/**
 * Created by yovaliceroman on 4/11/17.
 */
public class CustomerResource {

    @Autowired
    CustomerServices customerServices;

    @RequestMapping ("/customer")
    public ArrayList<Customer> allCustomers(){
        return customerServices.getAllCustomers();
    }

    public Customer customerByNumber(
            @RequestParam(value="customerNumber", defaultValue="1") int No){
        return customerServices.getCustomerByNo(No);
    }
}
