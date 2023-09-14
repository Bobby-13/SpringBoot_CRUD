package com.backend.SimpleWebAppBackend;

import com.backend.SimpleWebAppBackend.Repository.UserRepository;
import com.backend.SimpleWebAppBackend.Repository.Users;
import com.backend.SimpleWebAppBackend.Services.UserServices;
import org.junit.Before;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

public class UserServicesTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserServices userServices;

    @Before
    public void setUp()
    {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void PostTest()
    {
        Users users = new Users();

        when(userRepository.save(users)).thenReturn(null);

        String aa = userServices.postuser(users);

        Assertions.assertEquals("Added",aa);


    }

}
