package com.backend.SimpleWebAppBackend.Services;

import com.backend.SimpleWebAppBackend.Repository.UserRepository;
import com.backend.SimpleWebAppBackend.Repository.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.management.openmbean.KeyAlreadyExistsException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
@Service
public class UserServices {

    @Autowired
    public final UserRepository userRepository;

    public UserServices(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    public List<Users> getusers(){
        return userRepository.findAll();
    }

    public boolean getbyid(String email){
        return userRepository.existsById(email);
    }


    public String postuser(Users user)
    {
               userRepository.save(user);
               return "Added";


    }

    public void putuser(String email,Users user)
    {
        Users user1=new Users();
        user1.setAddress(user.getAddress());
        user1.setDate(user.getDate());
        user1.setEmail(email);
        user1.setFname(user.getFname());
        user1.setLname(user.getLname());
        user1.setMob_num(user.getMob_num());
        user1.setCurdate(user.getCurdate());
        userRepository.save(user1);
    }

    public void deleteuser(String email){
        userRepository.deleteById(email);
    }

    public List<Users> SearchBY(String query) {
        return userRepository.findByEmailContaining(query);
    }
}
