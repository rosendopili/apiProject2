package com.example.apiPROJECT.repository;

import com.example.apiPROJECT.model.UserProfile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileRepository extends CrudRepository <UserProfile, Long>  {

    public UserProfile findByProfileId(UserProfile id);
}
