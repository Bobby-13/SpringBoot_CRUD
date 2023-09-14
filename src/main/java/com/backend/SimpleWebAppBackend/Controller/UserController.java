package com.backend.SimpleWebAppBackend.Controller;

import com.backend.SimpleWebAppBackend.Repository.Users;
import com.backend.SimpleWebAppBackend.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserServices userServices;

    @GetMapping("/get")
    public List<Users> Getuser()
    {
        return userServices.getusers();
    }

    @GetMapping("/getbyid/{email}")
    public boolean GetByid(@PathVariable String email)
    {
//        return userServices.getbyid(uid);
        return userServices.getbyid(email);
    }


    @GetMapping("/search")
    public List<Users> searchby(@RequestParam String query)
    {
        return userServices.SearchBY(query);
    }

    @PostMapping("/post")
    public String Postuser(@RequestBody Users user) throws ParseException {

        return userServices.postuser(user);
    }

    @PutMapping("/put/{email}")
    public void Putuser(@PathVariable String email,@RequestBody Users user)
    {
        userServices.putuser(email,user);
    }

    @DeleteMapping("/delete/{email}")
    public void Deleteuser(@PathVariable String email)
    {
        userServices.deleteuser(email);
    }

}
