package com.airial.controllers;

import com.airial.domain.Post;
import com.airial.service.PostService;
import com.ocpsoft.pretty.faces.annotation.URLMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.List;

@Component
@ManagedBean
@RequestScoped
@URLMapping(id = "posts", pattern = "/posts/", viewId = "/faces/posts/list.xhtml")
public class PostsController {

    @Autowired
    private PostService postService;

    private List<Post> posts;

    public List<Post> getPosts() {
        return postService.findAll();
    }
}
