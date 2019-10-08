package com.example.springbootmonolith.Service;

import com.example.springbootmonolith.Model.UserProfile;

public interface UserProfileService {

    public UserProfile createUserProfile(String username, UserProfile newProfile);

    public UserProfile getUserProfile(String username);
}
