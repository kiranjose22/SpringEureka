package com.cognizant.user;

import org.springframework.data.repository.CrudRepository;

import com.cognizant.entities.Users;

public interface UserRepository extends CrudRepository<Users, String> {

}
