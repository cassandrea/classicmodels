package com.classicmodels.resources;

import com.classicmodels.model.Employee;
import com.classicmodels.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;

/**
 * Created by yovaliceroman on 4/11/17.
 */

public class EmployeeResource {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/employee")
    public ArrayList<Employee> allEmployee(){
        return employeeService.getAllEmployee();
    }

    public Employee employeeByNumber(
            @RequestParam(value="employeeNumber", defaultValue="1") int No){
        return employeeService.getEmployeeByNo(No);

    }
}
