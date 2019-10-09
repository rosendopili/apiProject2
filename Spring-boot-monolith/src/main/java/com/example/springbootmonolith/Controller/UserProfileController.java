package com.example.springbootmonolith.Controller;

import com.example.springbootmonolith.Service.UserProfileService;
import com.example.springbootmonolith.model.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profile")
public class UserProfileController {

    @Autowired
    private UserProfileService userProfileService;


    @GetMapping("/{username}")
    public UserProfile getUserProfile(@PathVariable String username) {
        return userProfileService.getUserProfile(username);
    }

    @PostMapping("/{username}")
    public  UserProfile createUserProfile(@PathVariable String username, @RequestBody UserProfile userProfile) {
        return userProfileService.createUserProfile(username, userProfile);
    }

}
