package com.classicmodels.services;

import com.classicmodels.data.EmployeeMapper;
import com.classicmodels.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;

/**
 * Created by yovaliceroman on 4/11/17.
 */
public class EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    public Employee getEmployeeByNo(int No){
        return employeeMapper.findEmployeeByEmployeeNumber(No);
    }

    public ArrayList<Employee> getAllEmployee(){
        return employeeMapper.findAllEmployees();
    }
}
