package com.revature.services;

import com.revature.models.Employee;
import com.revature.repos.EmployeeDAO;

public class EmployeeService {
    private EmployeeDAO employeeDAO = new EmployeeDAOImpl();

    public Employee callEmployee(int id){
        return employeeDAO.findEmployee(id);
    }
}
