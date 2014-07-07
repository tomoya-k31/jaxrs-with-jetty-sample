package me.tomoya.controllers;

import me.tomoya.beans.CombinedAnnotationBean;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by tomo on 2014/07/07.
 */
@Path("/combinedAnnotations")
public class CombinedAnnotationController {

    @Produces(MediaType.APPLICATION_JSON)
    @GET
    public CombinedAnnotationBean getAccount() {
        return new CombinedAnnotationBean(12);
    }
}
