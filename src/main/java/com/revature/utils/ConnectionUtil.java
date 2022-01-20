package com.revature.utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

    public static Connection getConnection() throws SQLException {
        //For many frameworks using JDBC it is necessary to "register" the driver
        //package you are using. This is to make the framework aware of it.
        try {
            Class.forName(("org.postgresql.Driver"));
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        String url = "jdbc:postgresql://employee-management-system.cehcjnxrsoid.us-east-1.rds.amazonaws.com:5432/employeemanagementsystem";
        String username = "postgres";
        String password = "password";

        return DriverManager.getConnection(url, username, password);
    }

//    public static void main(String[] args){
//        try{
//            getConnection();
//            System.out.println("Connection successful");
//        }catch (SQLException e){
//            System.out.println("Connection failed");
//            e.printStackTrace();
//        }
//    }
}