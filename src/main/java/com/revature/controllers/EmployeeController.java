package com.revature.controllers;

import com.revature.services.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmployeeController implements Controller {

    private static Logger log = LoggerFactory.getLogger(EmployeeController.class);

    private EmployeeService employeeService = new EmployeeService();

//    Handler getEmployee = (ctx) -> {
//        if(ctx.req.getSession(false)!=null){
//            String idString = ctx.pathParam("id");
//            int id = Integer.parseInt(idString);
//            Employee employee = employeeService.callEmployee(id);
//            ctx.json(avenger);
//            ctx.status(200);
//        }else {
//            ctx.status(401);
//        }
//    };
//
//    @Override
//    public void addRoutes(Javalin app) {
//        app.get("/avenger/{id}", getAvenger);
//    }

}
