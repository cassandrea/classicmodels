package com.classicmodels.data;

import com.classicmodels.model.Customer;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

public interface CustomerMapper {

    @Select("select customerNumber, customerName, contactLastName, contactFirstName, phone, addressLine1, addressLine2," +
            "city, state, postalCode, country, salesRepEmployeeNumber, creditLimit from customers where customerNumber = " +
            "#{customerNumber}")
    Customer findCustomerByCustomerNumber(int customerNumber);

    @Select("select customerNumber, customerName, contactLastName, contactFirstName, phone, addressLine1, addressLine2," +
            "city, state, postalCode, country, salesRepEmployeeNumber, creditLimit from customers")
    ArrayList<Customer> findAllCustomers();

}


