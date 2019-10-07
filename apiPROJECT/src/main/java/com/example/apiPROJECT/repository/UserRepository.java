package com.example.apiPROJECT.repository;

import com.example.apiPROJECT.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository <User, Long>  {

    public User findByUsername(User username);

}
