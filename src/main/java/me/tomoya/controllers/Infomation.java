package me.tomoya.controllers;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by usr0200379 on 2014/07/11.
 */
@Path("/api/info")
public class Infomation {

    @GET
    @Produces("text/plain")
    public Response getInfo() {
        return Response.ok("Hello world!").build();
    }

    @GET
    @Path("/list/")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getInfoList() {
        Map<String, Object> resParam = new HashMap();
        resParam.put("id", 10000);
        resParam.put("md5", "dksahc*)&V*&vc87ssC&*S^87s");
        return Response.ok(resParam).build();
    }

    @GET
    @Path("/{id}/")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getInfo(@PathParam("id") String id) {
        System.out.printf(id);
        return Response.ok("dksahc*)&V*&vc87ssC&*S^87s").build();
    }

    @GET
    @Path("/search")
    @Produces(MediaType.APPLICATION_JSON)
    public Response search(
            @QueryParam("keyword") @DefaultValue("") String keyword
    ) {
        return Response.ok().build();
    }

}
