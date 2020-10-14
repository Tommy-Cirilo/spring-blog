package com.codeup.blog.controllers;

import com.codeup.blog.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@Controller
public class PostController {
    //This first request mapping gets the all of the return strings from the path /posts
    @RequestMapping(path = "/posts", method = RequestMethod.GET)
    public String showAllPosts(Model model) {
        List<Post> postList = new ArrayList<>();
        postList.add(new Post(0, "First Post", "This is the first Post"));
        postList.add(new Post(0, "Second Post", "This is the second Post"));
        model.addAttribute("posts", postList);
        return "posts/index";
    }

    //This get mapping gets an individual posts id and returns a single post
    @GetMapping("/posts/{id}")
    public String showOnePost(@PathVariable long id, Model model) {
        Post post = new Post(0, "Single Post", "This is the body for the single post");
        model.addAttribute("post", post);
        return "posts/show";
    }

    //This request mapping views the form and gets the data for creating a post
    @RequestMapping(path = "/posts/create", method = RequestMethod.GET)
    @ResponseBody
    public String createPostForm() {
        return "Tell me about your day!";
    }

    //This request mapping actually post and sends the created post from the form to the database
    @RequestMapping(path = "/posts/create", method = RequestMethod.POST)
    @ResponseBody
    public String sendingCreatedPostToDB() {
        return "Sending your diary page to be seen by everyone. :)";
    }
}
