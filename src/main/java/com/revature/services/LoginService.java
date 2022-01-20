package com.revature.services;

import com.revature.repos.EmployeeDAO;
import com.revature.repos.EmployeeDAOImpl;
import org.mindrot.jbcrypt.BCrypt;

public class LoginService {

    EmployeeDAO employeeDAO = new EmployeeDAOImpl();

    public boolean login(String employeeUsername, String passWord){
        String hashedPW = BCrypt.hashpw(passWord, BCrypt.gensalt());

        String dbPassword = employeeDAO.verifyPassword(employeeUsername);

        return BCrypt.checkpw(dbPassword, hashedPW);
    }
}
