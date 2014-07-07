package me.tomoya.controllers;

import me.tomoya.beans.User;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tomo on 2014/07/07.
 */
@Path("/users")
public class Users {

    @Produces(MediaType.APPLICATION_JSON)
    @GET
    public List<User> getUserList() {
        List<User> users = new ArrayList();
        users.add(new User("tomo", 1001111, "tokyo 1"));
        users.add(new User("kazu", 2002222, "tokyo 2"));
        users.add(new User("taku", 3003333, "tokyo 3"));
        return users;
    }
}
