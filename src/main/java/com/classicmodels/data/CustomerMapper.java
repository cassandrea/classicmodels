package com.classicmodels.data;

import com.classicmodels.model.Customer;
import org.apache.ibatis.annotations.Select;
import java.util.List;


/**
 * Created by yovaliceroman on 4/11/17.
 */

public interface CustomerMapper {

    @Select("select customerNumber, customerName, contactLastName, contactFirstName, phone, addressLine1, addressLine2," +
            "city, state, postalCode, country, salesRepEmployeeNumber, creditLimit from customers where customerNumber = " +
            "#{customerNumber}")
    Customer findCustomerByNo(int No);

    @Select("select customerNumber, customerName, contactLastName, contactFirstName, phone, addressLine1, addressLine2," +
            "city, state, postalCode, country, salesRepEmployeeNumber, creditLimit from customers")
    List<Customer> findAllCustomers();

}


