package com.classicmodels.services;

import com.classicmodels.data.CustomerMapper;
import com.classicmodels.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;

public class CustomerService {

     @Autowired
    CustomerMapper customerMapper;

     public Customer getCustomerByNo(int No){
         return customerMapper.findCustomerByCustomerNumber(No);
     }

    public ArrayList<Customer> getAllCustomers(){
        return customerMapper.findAllCustomers();
    }
}
