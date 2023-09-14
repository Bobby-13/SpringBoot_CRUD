package com.backend.SimpleWebAppBackend;

import com.backend.SimpleWebAppBackend.Controller.UserController;
import com.backend.SimpleWebAppBackend.Repository.Users;
import com.backend.SimpleWebAppBackend.Services.UserServices;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.text.ParseException;

import static org.mockito.Mockito.*;

public class UserControllerTest {

     @Mock
     private UserServices userServices;

    @InjectMocks
    private UserController userController;


    @Before
    public void setUp(){
        MockitoAnnotations.openMocks(this);
    }

   @Test
    public void PostCheck() throws ParseException {
        Users user=new Users();
        when(userServices.postuser(user)).thenReturn("Added");
        String aa = userController.Postuser(user);
        Assertions.assertEquals("Added",aa);

    }
}
