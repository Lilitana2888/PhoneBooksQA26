package com.telran.model;

public class User {
    private  String email;
    private  String pswd;

//    public user(String email, String pswd) {
//        this.email = email;
//        this.pswd = pswd;
//    }


    public User withEmail(String email) {
        this.email = email;
        return this;
    }

    public User withPswd(String pswd) {
        this.pswd = pswd;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public String getPswd() {
        return pswd;
    }
}
