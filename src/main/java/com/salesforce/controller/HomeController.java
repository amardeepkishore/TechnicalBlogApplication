package com.salesforce.controller;

import com.salesforce.model.Post;
import com.salesforce.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;

@Controller
public class HomeController {

    public HomeController() {
        System.out.println("*** HomeController ***");
    }

    @Autowired
    private PostService postService;

    @RequestMapping("/")
    public String getallPosts(Model model) {
        ArrayList<Post> allPosts = postService.getAllPosts();
        model.addAttribute("posts", allPosts);

        return "index";
    }
}

