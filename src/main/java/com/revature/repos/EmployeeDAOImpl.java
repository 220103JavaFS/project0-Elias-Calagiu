package com.revature.repos;

import com.revature.models.Employee;
import com.revature.utils.ConnectionUtil;
import com.sun.deploy.net.MessageHeader;

import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO{

    @Override
    public List<Employee> findAll() {
        try(Connection conn = ConnectionUtil.getConnection()){

            String sql = "SELECT * FROM employees;";

            Statement statement = conn.createStatement();

            ResultSet result = statement.executeQuery(sql);

            List<Employee> list= new ArrayList<>();

            while(result.next()){
                Employee employee = new Employee();
                employee.setId(result.getInt("employee_id"));
                employee.setFirstName(result.getString("first_name"));
                employee.setLastName(result.getString("last_name"));
                list.add(employee);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return new ArrayList<Employee>();
    }

    @Override
    public Employee findEmployee(int id) {
        return null;
    }

    @Override
    public boolean addEmployee(Employee employee) {
        return false;
    }

    @Override
    public boolean updateEmployee(Employee employee) {
        return false;
    }

    @Override
    public boolean deleteEmployee(int id) {
        return false;
    }
}
