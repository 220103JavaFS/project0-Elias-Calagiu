package com.revature.repos;

import com.revature.models.Department;
import com.revature.utils.ConnectionUtil;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class DepartmentDAOImpl implements DepartmentDAO{


    @Override
    public List<Department> findAllDepartments() {
        try (Connection connect = ConnectionUtil.getConnection()){

            String sql = "SELECT * FROM departments;";

            Statement statement = connect.createStatement();

            ResultSet result = statement.executeQuery(sql);

            List<Department> departmentList = new ArrayList<>();

            while(result.next()){
                Department department = new Department();
                department.setDepartmentId(result.getInt("department_id"));
                department.setDepartmentName(result.getString("department_name"));

                departmentList.add(department);
            }

            return departmentList;
        } catch (SQLException e){
            e.printStackTrace();
        }
        return new ArrayList<Department>();
    }


    @Override
    public Department findByDepartment(int departmentId) {
        return null;
    }

    @Override
    public boolean updateDepartment(Department department) {
        return false;
    }

    @Override
    public boolean addDepartment(Department department) {
        return false;
    }
};



