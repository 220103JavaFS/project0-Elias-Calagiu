package com.revature.repos;

import com.revature.models.Employee;
import com.revature.utils.ConnectionUtil;

import java.sql.*;
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
    public Employee findByLastName(String lastName) {
        try (Connection conn = ConnectionUtil.getConnection()) {

            String sql = "SELECT * FROM employees WHERE last_name = ?;";

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, lastName);
            ResultSet result = statement.executeQuery();

            Employee employee = new Employee();

            if (result.next()) {
                employee.setId(result.getInt("employee_id"));
                employee.setFirstName(result.getString("first_name"));
                employee.setLastName(result.getString("last_name"));
//                list.add(employee);
            }
            return employee;
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return new Employee();
    }



    @Override
    public boolean addEmployee(Employee employee) {
        return false;
    }

    @Override
    public boolean updateEmployee(Employee employee) {
        try(Connection conn = ConnectionUtil.getConnection()){
            String sql = "UPDATE employees SET first_name = ?, SET last_name = ?";

            PreparedStatement statement = conn.prepareStatement(sql);

            int count = 0;
            statement.setString(++count, employee.getFirstName());
            statement.setString(++count, employee.getLastName());

            statement.execute();

            return true;


        }catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteEmployee(int id) {
        return false;
    }

    @Override
    public String verifyPassword(String userName) {
        return null;
    }
}
