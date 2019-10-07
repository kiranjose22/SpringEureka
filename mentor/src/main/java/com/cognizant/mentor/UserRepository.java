package com.cognizant.mentor;

import org.springframework.data.repository.CrudRepository;

import com.cognizant.mentor.entities.Users;

public interface UserRepository extends CrudRepository<Users, String> {

}
