package com.revature.repos;

import com.revature.models.Department;

import java.util.List;

public interface DepartmentDAO {

    List<Department> findAllDepartment();
    Department findByDepartment(int departmentId);
    boolean updateDepartment(Department department);
    boolean addDepartment(Department department);
}
