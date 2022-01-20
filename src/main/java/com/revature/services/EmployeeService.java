package com.revature.services;

import com.revature.models.Employee;
import com.revature.repos.EmployeeDAO;
import com.revature.repos.EmployeeDAOImpl;

import java.util.List;

public class EmployeeService {
    private EmployeeDAO employeeDAO = new EmployeeDAOImpl();

    public List<Employee> findAllEmployees() {
        return employeeDAO.findAllEmployees();
    }

    public Employee findbyLastName(String lastName){
        return employeeDAO.findByLastName(lastName);
    }

    public boolean updateEmployee (Employee employee){
        return employeeDAO.updateEmployee(employee);
    }

    public boolean addEmployee (Employee employee){
        return employeeDAO.addEmployee(employee);
    }
//    public Employee callEmployee(int id){
//        return employeeDAO.findEmployee(id);
//    }


}
