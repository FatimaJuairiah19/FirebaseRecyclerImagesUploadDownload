package com.example.uploadandretrivephoto;

public class User {


    private String username;
    private String imageURL;



    public User(String username, String imageURL) {

        this.username = username;
        this.imageURL = imageURL;

    }

    public User() {

    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

}