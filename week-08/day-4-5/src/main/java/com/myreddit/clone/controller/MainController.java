package com.myreddit.clone.controller;

import com.myreddit.clone.model.Post;
import com.myreddit.clone.model.RedditUser;
import com.myreddit.clone.service.RedditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
    private RedditService redditService;

    @Autowired
    public MainController(RedditService redditService) {
        this.redditService = redditService;
    }


    @GetMapping("/")
    public String getLogin() {
        return "login";
    }

    @PostMapping("/")
    public String postLogin(String userName) {
        if (redditService.doesUserExistsWithUserName(userName)) {
            redditService.loadUser(redditService.getUserByName(userName));
            return "redirect:/main";
        } else {
            redditService.createErrorMessage(userName + " doesn't exist!");
            return "redirect:/createuser/" + userName;
        }
    }

    @GetMapping("/createuser")
    public String getCreateUser(Model model) {
        model.addAttribute("user", new RedditUser());
        return "createuser";
    }

    @GetMapping("/createuser/{username}")
    public String getCreateUserUserNameisFilled(@PathVariable("username") String userName,
                                                Model model) {
        model.addAttribute("user", new RedditUser(userName));
        model.addAttribute("error", redditService.getErrorMessageByContainsUserName(userName));
        return "createuser";
    }

    @PostMapping("/createuser")
    public String postCreateUser(@ModelAttribute RedditUser redditUser) {
        if (!redditService.doesUserExistsWithUserName(redditUser.getRedditUsername())) {
            redditService.createUser(redditUser);
            redditService.loadUser(redditService.getUserByName(redditUser.getRedditUsername()));
            return "redirect:/main";
        } else {
            redditService.createErrorMessage("Account with name: " + redditUser.getRedditUsername() +
                    " already exists. Please choose another User Name");
            return "redirect:/createuser/" + redditUser.getRedditUsername();
        }
    }

    @GetMapping("/main")
    public String getMain(Model model) {
        model.addAttribute("user", redditService.getActiveUser());
        model.addAttribute("posts", redditService.getPosts());
        return "main";
    }

    @GetMapping("/createpost")
    public String getCreatePost(Model model) {
        model.addAttribute("post", new Post());
        return "createpost";
    }

    @PostMapping("/createpost")
    public String postCreatePost(@ModelAttribute Post post) {
        redditService.createPost(post);
        return "redirect:/main";
    }

    @GetMapping("/main/{id}/plus")
    public String getMainPlus(@PathVariable(value = "id") Long id) {
        if (redditService.getPostById(id) != null) {
            redditService.upvotePost(id);
        }
        return "redirect:/main";
    }

    @GetMapping("/main/{id}/minus")
    public String getMainMinus(@PathVariable(value = "id") Long id) {
        if (redditService.getPostById(id) != null) {
            redditService.downvotePost(id);
        }
        return "redirect:/main";
    }

    @GetMapping("userpage/{id}")
    public String getUserPage(@PathVariable(value = "id") Long id,
                              Model model) {
        model.addAttribute("user", redditService.getUserById(id));
        return "userpage";
    }
}
