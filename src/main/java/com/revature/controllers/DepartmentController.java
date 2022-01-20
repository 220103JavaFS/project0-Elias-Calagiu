package com.revature.controllers;

import com.revature.models.Department;
import com.revature.services.DepartmentService;
import io.javalin.Javalin;
import io.javalin.http.Handler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DepartmentController  implements Controller{

    private static Logger log = LoggerFactory.getLogger(DepartmentController.class);


    private DepartmentService departmentService = new DepartmentService();

    Handler getDepartments = (ctx) ->{
        if(ctx.req.getSession(false)!=null) { //returns session object if cookie is valid
            ctx.json(departmentService.findALLDepartments()); //method from DepartmentService class
            ctx.status(200);
            log.info("Response received! All departments displayed.");
        } else {
            ctx.status(401);
            log.warn("Invalid Request sent!");
        }


    };

    Handler getOneDepartment = (ctx) -> {
        if(ctx.req.getSession(false)!=null) { //returns session object if cookie is valid
            String departmentIdString = ctx.pathParam("departmentId");
            int departmentId = Integer.parseInt(departmentIdString); //taking param string and converting to integer
            Department department = departmentService.findDepartment(departmentId); //integer is passed in service method
            ctx.json(department);
            ctx.status(200);
            log.info("Response received! Department returned.");
        } else {
            ctx.status(401);
            log.warn("Invalid Request sent!");
        }

    };

    Handler updateDepartment = (ctx) -> {
        if(ctx.req.getSession(false)!=null) { //returns session object if cookie is valid
            Department department = ctx.bodyAsClass(Department.class);
            if(departmentService.updateDepartment(department)){
                ctx.status(200);
                log.info("Response received! Updated department number.");
            }else{
                ctx.status(400);
            }
        } else {
            ctx.status(401);
            log.warn("Invalid Request sent!");
        }

    };

    Handler addDepartment = (ctx) -> {
        if(ctx.req.getSession(false)!=null) { //returns session object if cookie is valid
            Department department = ctx.bodyAsClass(Department.class);
            if(departmentService.addDepartment(department)){
                ctx.status(200);
                log.info("Response received! New department added.");
            }else{
                ctx.status(400);
            }
        } else {
            ctx.status(401);
            log.warn("Invalid Request sent!");
        }

    };


    @Override
    public void addRoutes(Javalin app) {
        //dept routes
        app.get("/department", getDepartments);
        app.get("/department/{departmentId}", getOneDepartment);
        app.put("/department", updateDepartment);
        app.post("/department", addDepartment);
    }
}
