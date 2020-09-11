package com.christ.smartvideo2.web;

import com.christ.smartvideo2.domain.User1;
import com.christ.smartvideo2.service.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    private UserDao userDao;
    @Autowired
    public void setUserDao(UserDao userDao){
        this.userDao=userDao;
    }
    @RequestMapping("/get-by-email")
    @ResponseBody
    public String getByEmail(String email) {
        String userId;
        User1 user = userDao.findByEmail(email);
        if (user != null) {
            userId = String.valueOf(user.getId());
            return "The user id is: " + userId;
        }
        return "user " + email + " is not exist.";
    }
}
