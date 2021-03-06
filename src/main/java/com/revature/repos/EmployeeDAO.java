package com.revature.repos;

import com.revature.models.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAllEmployees();
    Employee findEmployee(int id);

    Employee findByLastName(String lastName);

    boolean addEmployee(Employee employee);
    boolean updateEmployee(Employee employee);
    boolean deleteEmployee(int id);

    String verifyPassword(String employeeUsername);
}
