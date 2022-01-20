package com.revature.repos;

import com.revature.models.Employee;
import com.revature.models.Titles;

import java.util.List;

public interface TitlesDAO {

    List<Titles> findAll();
    Titles findbyTitle (int id);
    boolean addEmployee(Employee employee);
    boolean updateEmployee(Employee employee);
    boolean deleteEmployee(int id);
}
