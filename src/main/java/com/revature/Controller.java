package com.revature;

import io.javalin.Javalin;

public abstract class Controller {
    public abstract void addRoutes(Javalin app);
}
