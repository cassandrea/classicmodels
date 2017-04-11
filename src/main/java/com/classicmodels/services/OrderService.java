package com.classicmodels.services;

import com.classicmodels.data.OrderMapper;
import com.classicmodels.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;


public class OrderService {

    @Autowired
    OrderMapper orderMapper;

    public Order getOrderByNo(int No){
        return orderMapper.findOrderByOrderNumber(No);
    }

    public ArrayList<Order> getAllOrders(){
        return orderMapper.findAllOrders();
    }
}
