package com.example.springbootmonolith.Service;

import com.example.springbootmonolith.Repository.UserProfileRepository;
import com.example.springbootmonolith.model.User;
import com.example.springbootmonolith.model.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserProfileServiceImpl implements UserProfileService {

    @Autowired
    UserProfileRepository userProfileRepository;

    @Autowired
    UserService userService;

    /**
     *
     * @param username
     * @param newProfile
     * @return
     */
    @Override
    public UserProfile createUserProfile(String username, UserProfile newProfile) {
        User user = userService.getUser(username);
        newProfile.setUser(user);

        return userProfileRepository.save(newProfile);
    }

    /**
     *
     * @param username
     * @return
     */
    @Override
    public UserProfile getUserProfile(String username) {
        return userProfileRepository.findProfileByUsername(username);
    }
}

