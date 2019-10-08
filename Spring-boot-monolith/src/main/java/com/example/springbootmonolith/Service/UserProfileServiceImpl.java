package com.example.springbootmonolith.Service;

import com.example.springbootmonolith.Repository.UserProfileRepository;
import com.example.springbootmonolith.model.User;
import com.example.springbootmonolith.model.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class UserProfileServiceImpl implements UserProfileService {

    @Autowired
    UserProfileRepository userProfileRepository;

    @Override
    public UserProfile createUserProfile(String username, UserProfile newProfile) {
        return null;
    }

    @Override
    public UserProfile getUserProfile(String username) {
        return null;
    }
}

