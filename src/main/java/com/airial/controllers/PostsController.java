package com.airial.controllers;

import com.airial.domain.Post;
import com.airial.service.PostService;
import com.ocpsoft.pretty.faces.annotation.URLMapping;
import com.ocpsoft.pretty.faces.annotation.URLMappings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.List;

@Component
@ManagedBean
@RequestScoped
@URLMappings(mappings={
        @URLMapping(id = "posts", pattern = "/posts/", viewId = "/faces/posts/list.xhtml"),
        @URLMapping(id = "postEdit", pattern = "/posts/#{postsController.id}/edit", viewId = "/faces/posts/edit.xhtml")
})
public class PostsController {

    @Autowired
    private PostService postService;

    private List<Post> posts;

    private Post post;

    private Long id;

    public List<Post> getPosts() {
        return postService.findAll();
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Post getPost() {
        return postService.findById(id);
    }

}
