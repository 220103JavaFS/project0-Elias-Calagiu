package com.revature.services;

import com.revature.models.Employee;
import com.revature.repos.EmployeeDAO;

import java.util.List;

public class EmployeeService {
    private EmployeeDAO employeeDAO = new EmployeeDAOImpl();

    public List<Employee> findAllEmployees;
//    public Employee callEmployee(int id){
//        return employeeDAO.findEmployee(id);
    }
//}
