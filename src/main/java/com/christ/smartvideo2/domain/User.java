package com.christ.smartvideo2.domain;


public class User {
    private String username;
    private String userid;
    private String password;
    private String phone;
    private String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(){

    }
    public User(String username,String userid,String password,String phone,String email){
        this.username=username;
        this.userid=userid;
        this.password=password;
        this.phone=phone;
        this.email=email;
    }
}
