package com.cognizant.mentor.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Results {
    @Id
    String userName;
    int experience;

    public Results() {
    }

    public Results(String userName, int experience) {
        this.userName = userName;
        this.experience = experience;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
