package com.cognizant.admin;

import org.springframework.data.repository.CrudRepository;

import com.cognizant.admin.entities.Users;

public interface UserRepository extends CrudRepository<Users, String> {

}
