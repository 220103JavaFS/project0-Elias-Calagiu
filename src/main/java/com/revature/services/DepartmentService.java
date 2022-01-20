package com.revature.services;

import com.revature.models.Department;
import com.revature.repos.DepartmentDAO;
import com.revature.repos.DepartmentDAOImpl;

import java.util.List;

public class DepartmentService {
    DepartmentDAO departmentDAO = new DepartmentDAOImpl();

    public List<Department> findALLDepartments(){
        return departmentDAO.findAllDepartment(); //DAO method
    }

    public Department findDepartment(int deptNum) {
        return departmentDAO.findByDepartment(deptNum);
    }

    public boolean updateDepartment(Department department){
        return departmentDAO.updateDepartment(department);
    }

    public boolean addDepartment(Department department){
        return departmentDAO.addDepartment(department);
    }
}