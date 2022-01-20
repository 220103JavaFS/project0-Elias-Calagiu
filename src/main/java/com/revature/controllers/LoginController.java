package com.revature.controllers;

import com.revature.models.UserDTO;
import com.revature.services.EmployeeService;
import com.revature.services.LoginService;
import io.javalin.Javalin;
import io.javalin.http.Handler;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;


public class LoginController implements Controller{
    private static Logger log = LoggerFactory.getLogger(LoginController.class);
    LoginService loginService = new LoginService();
    EmployeeService employeeService = new EmployeeService();


    private Handler loginAttempt = (ctx) -> {
        UserDTO user =ctx.bodyAsClass(UserDTO.class);

        if(loginService.login(user.username, user.password)){
            ctx.req.getSession();
            ctx.status(200);
        }else {
            ctx.req.getSession().invalidate();
            ctx.status(401);
            log.warn("invalid credentials");
        }
    };
    @Override
    public void addRoutes(Javalin app) {
        app.post("/login", this.loginAttempt);
    }
}
