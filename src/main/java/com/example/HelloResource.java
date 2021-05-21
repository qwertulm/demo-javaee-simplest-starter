package com.example;

import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("")
public class HelloResource
{
    @GET
    @Produces({ "text/plain" })
    public String hello() {
        return "HELLO";
    }
}
