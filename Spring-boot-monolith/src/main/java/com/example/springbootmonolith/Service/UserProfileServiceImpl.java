package com.example.springbootmonolith.Service;

import com.example.springbootmonolith.Repository.UserProfileRepository;
import com.example.springbootmonolith.Model.User;
import com.example.springbootmonolith.Model.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserProfileServiceImpl implements UserProfileService{

    @Autowired
    UserProfileRepository userProfileRepository;

//    @Autowired
//    UserService userService;

//    @Override
//    public UserProfile createUserProfile(String username, UserProfile newProfile) {
//        User user = userService.getUser(username);
//        newProfile.setUser(user);
//        return userProfileRepository.save(newProfile);
//    }

    @Override
    public UserProfile createUserProfile(String username, UserProfile newProfile) {
        return null;
    }

    @Override
    public UserProfile getUserProfile(String username){
        return userProfileRepository.findProfileByUsername(username);
    }
}


