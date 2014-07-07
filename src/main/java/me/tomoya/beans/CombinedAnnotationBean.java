package me.tomoya.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by tomo on 2014/07/07.
 */
@XmlRootElement(name = "account")
public class CombinedAnnotationBean {

    @JsonProperty("value")
    int x;

    public CombinedAnnotationBean(int x) {
        this.x = x;
    }

    public CombinedAnnotationBean() {
        this(15);
    }
}
