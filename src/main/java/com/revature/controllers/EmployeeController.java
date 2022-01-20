package com.revature.controllers;

public class EmployeeController implements Controller {

    private EmployeeService employeeService = new EmployeeService();

//    Handler getAvenger = (ctx) -> {
//        if(ctx.req.getSession(false)!=null){
//            String idString = ctx.pathParam("id");
//            int id = Integer.parseInt(idString);
//            Avenger avenger = avengerService.callAvenger(id);
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
