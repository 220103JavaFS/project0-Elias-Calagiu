package com.revature.controllers;

import com.revature.models.Employee;
import com.revature.services.EmployeeService;
import io.javalin.Javalin;
import io.javalin.http.Handler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class EmployeeController implements Controller {

    private static Logger log = LoggerFactory.getLogger(EmployeeController.class);

    private EmployeeService employeeService = new EmployeeService();

    Handler getEmployees = (ctx) ->{
        if(ctx.req.getSession(false)!=null) {
            ctx.json(employeeService.findAllEmployees());
            ctx.status(200);
        }else {
            ctx.status(401);
        }
    };

    Handler getEmployee = (ctx) -> {
        if(ctx.req.getSession(false)!=null){
            String lastName= ctx.pathParam("lastName");
            Employee employee = employeeService.findbyLastName(lastName);
            ctx.json(employee);
            ctx.status(200);
        }else {
            ctx.status(401);
        }
    };

    Handler updateEmployee = (ctx) -> {
        if(ctx.req.getSession(false)!=null) {
            Employee employee = ctx.bodyAsClass(Employee.class);
            if(employeeService.updateEmployee(employee)){
                ctx.status(200);
            }else {
                ctx.status(400);
            }
        } else {
            ctx.status(401);
        }

    };

    Handler newEmployee = (ctx)-> {
        if (ctx.req.getSession(false) != null) {
            Employee employee = ctx.bodyAsClass(Employee.class);
            if (employeeService.addEmployee(employee)) {
                ctx.status(200);
            } else {
                ctx.status(400);
            }
        } else {
            ctx.status(401);
        }
    };

//
    @Override
    public void addRoutes(Javalin app) {
        app.get("/employee", getEmployees);
        app.get("/employee/{lastName}", getEmployee);
        app.put("/employee", updateEmployee);
        app.post("/employee", newEmployee);
    }

}
