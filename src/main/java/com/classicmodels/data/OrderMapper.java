package com.classicmodels.data;

import com.classicmodels.model.Order;
import org.apache.ibatis.annotations.Select;
import java.util.ArrayList;


public interface OrderMapper {

    @Select("select * from orders where orderNumber = " +
            "#{orderNumber}")
    Order findOrderByOrderNumber(int orderNumber);

    @Select("select * from orders")
    ArrayList<Order> findAllOrders();

}


