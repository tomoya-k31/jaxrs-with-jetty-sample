package me.tomoya.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * Created by tomo on 2014/07/06.
 */
@Path("/helloworld")
public class HelloWorld {

    @GET
    @Produces("text/plain")
    public Response getText() {
        return Response.ok("Hello world!").build();
    }

    @POST
    @Produces("text/plain")
    public Response getPostText() {
        return Response.ok("Post world!").build();
    }
}
