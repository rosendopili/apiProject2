package com.example.apiPROJECT.repository;

import com.example.apiPROJECT.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <User, Long>  {

    public User findByUsername(User username);


}
