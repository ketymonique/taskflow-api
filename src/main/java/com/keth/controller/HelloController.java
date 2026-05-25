package com.keth.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/hello")
public class HelloController {

    @GET
    public String hello() {
        return "API funcionando!";
    }
}