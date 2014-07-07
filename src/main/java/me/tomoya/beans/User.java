package me.tomoya.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by tomo on 2014/07/07.
 */
@XmlRootElement(name = "user")
public class User {

    @JsonProperty("name")
    String name;

    @JsonProperty("post")
    int post;

    @JsonProperty("address")
    String address;

    public User(String name, int post, String address) {
        this.name = name;
        this.post = post;
        this.address = address;
    }
}
