package com.cognizant.mentor;

import java.util.ArrayList;
//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.mentor.entities.Users;

@RestController
public class Controller {

    @Autowired
    UserService userService;

//    @Autowired
//    TrainingsService trainingsService;
//
//    @Autowired
//    SearchService searchService;

    @RequestMapping("")
    public String hi() {
        return "Hi";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Hello!";
    }

    @RequestMapping("/mentors")
    public ArrayList<MentorSignUpModel> getList(){
        return userService.getUserList();
    }

    @RequestMapping("/mentors/{id}")
    public Users getUserList(@PathVariable String id){
        return userService.getUser(id);
    }

//    @RequestMapping("/trainings")
//    public ArrayList<Trainings> getTrainingList(){
//        return trainingsService.getTrainingsList();
//    }
//
//    @RequestMapping("/results")
//    public ArrayList<SearchResult> getResultList(){
//        return searchService.getResultList();
//    }
//
//    @RequestMapping(method=RequestMethod.POST,value = "/trainings")
//    public void addTrainings(@RequestBody Trainings s) {
//        trainingsService.addTrainingDetails(s);
//    }

    @RequestMapping(method=RequestMethod.POST,value = "/mentors")
    public void addUsers(@RequestBody MentorSignUpModel s) {

//        System.out.println("at controller"+s.getSkills());
        userService.addUserDetails(s);
    }
    @RequestMapping(method=RequestMethod.PUT,value = "/mentors/{id}")
    public void updateUser(@RequestBody Users s,@PathVariable String id){
        userService.updateUser(s,id);
    }

//    @RequestMapping(method=RequestMethod.PUT,value = "/trainings/{id}")
//    public void updateTraining(@RequestBody Trainings s,@PathVariable String id){
//        trainingsService.updateTraining(s, id);
//    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/mentors/{id}")
    public void deleteUser(@PathVariable String id) {
        userService.deleteUser(id);
    }

}