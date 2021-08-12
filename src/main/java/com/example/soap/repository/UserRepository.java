package com.example.soap.repository;

import com.mertcakmak.soap.GetUserResponse;
import com.mertcakmak.soap.User;
import org.springframework.stereotype.Component;


import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class UserRepository {

    private static final Map<String, User> users = new HashMap<>();

    @PostConstruct
    public void initData() {
        User user1 = new User();
        user1.setName("Admin");
        user1.setLastName("Admin");
        user1.setAge(21);

        User user2 = new User();
        user2.setName("Test");
        user2.setLastName("test");
        user2.setAge(22);

        User user3 = new User();
        user3.setName("Mert");
        user3.setLastName("Çakmak");
        user3.setAge(23);

        users.put(user1.getName(), user1);
        users.put(user2.getName(), user2);
        users.put(user3.getName(), user3);

    }

    public User findUserByName(String name) {
        return users.get(name);
    }

}
