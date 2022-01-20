package com.revature;
import com.revature.controllers.Controller;
import io.javalin.Javalin;

public class App {

    private static Javalin app;

    public static void main(String[] args) {
        app = Javalin.create(); //This represents the configuration of the framework at runtime.

        app.get("/hello", ((ctx) -> {
            String url = ctx.url();
            System.out.println(url);
            ctx.html("<h1> Hello Javalin </h1>");
            ctx.status(200);
        }));//ctx represents the context of the request/response for the Handler


        app.start();
    }

    public static void configure(Controller...controllers){

        for(Controller c: controllers){
            c.addRoutes(app);
        }
    }
}
