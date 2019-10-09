package com.cognizant.user;

import com.cognizant.user.entities.Course;
import org.springframework.data.repository.CrudRepository;


//import com.cognizant.entities.Trainings;
//import com.cognizant.entities.Users;

public interface CourseRepository extends CrudRepository<Course, String> {

}
