package com.airial.controllers;

import com.ocpsoft.pretty.faces.annotation.URLMapping;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


/**
 * Created by scambour on 09/05/14.
 */
@ManagedBean
@RequestScoped
@URLMapping(id = "posts", pattern = "/posts/", viewId = "/faces/posts/list.xhtml")
public class PostsController {

    private String message="Hello from Posts list page";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
