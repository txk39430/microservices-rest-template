package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    List<User> list=List.of( new User(23L,"Tejaswini","12345"),
            new User(24L,"Hemanth","56789"),
            new User(25L,"Venky","897654"));
    @Override
    public User getUser(Long id) {
        return list.stream().filter(user->user.getUserID().equals(id)).findAny().orElse(null);

    }
}
