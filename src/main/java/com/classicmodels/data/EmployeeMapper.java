package com.classicmodels.data;


import com.classicmodels.model.Employee;
import org.apache.ibatis.annotations.Select;
import java.util.ArrayList;

/**
 * Created by yovaliceroman on 4/11/17.
 */
public interface EmployeeMapper {

    @Select("select employeeNumber, lastName, firstLastName, extension, email, officeCode, reportsTo," +
            "jobTitle from employees where employeeNumber = #{employeeNumber}")
    Employee findEmployeeByEmployeeNumber(int employeeNumber);

    @Select("select employeeNumber, lastName, firstLastName, extension, email, officeCode, reportsTo," +
            "jobTitle from employees")
    ArrayList<Employee> findAllEmployees();
}
