package com.classicmodels.resources;

import com.classicmodels.model.Order;
import com.classicmodels.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;

public class OrderResource{

    @Autowired
    OrderService orderService;

    @RequestMapping ("/order")
    public ArrayList<Order> allOrders(){
        return orderService.getAllOrders();
    }

    public Order order(
            @RequestParam(value="orderNumber", defaultValue="1") int No){
        return orderService.getOrderByNo(No);
    }
}
