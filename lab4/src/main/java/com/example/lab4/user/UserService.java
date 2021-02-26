package com.example.lab4.user;

import com.example.lab4.location.Location;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {
    User user1 = new User(
            "u1",
            "Jany",
            "Lawrence",
            new Location("l1", "Astana"),
            "Jany@gmail.com"
    );

    User user2 = new User(
            "u2",
            "Jadon",
            "Mills",
            new Location("l2", "Almaty"),
            "Jadon@gmail.com"
    );

    private List<User> users = Arrays.asList(user1, user2);
    public List<User> getAllUsers() {
        return users;
    }
}
