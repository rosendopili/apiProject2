package com.example.apiPROJECT.model;

import javax.persistence.*;

@Entity
@Table(name = "userProfile")
public class UserProfile {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String location;

    @Column
    private String mobile;

    @Column
    private String bio;

//    @Column
//    private String profilePic;
//    will determine whether or not to implement this functionality at a later date

    @OneToOne (mappedBy = "userProfile",
            cascade = {CascadeType.ALL})
    private User user;

    public UserProfile() {}

    public User getUser(){return user;}

    public void setUser(User user){ this.user = user;}

    public long getId(){
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
