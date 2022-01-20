package com.revature.controllers;

import com.revature.models.UserDTO;
import io.javalin.Javalin;
import io.javalin.http.Handler;
import org.eclipse.jetty.security.LoginService;

public class LoginController implements Controller{
    LoginService loginService = new LoginService() {
    }
    private Handler loginAttempt = (ctx) -> {
        UserDTO user =ctx.bodyAsClass(UserDTO.class);

        if()
    };
    @Override
    public void addRoutes(Javalin app) {

    }
}
