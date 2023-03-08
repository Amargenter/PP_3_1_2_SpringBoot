package ru.kata.pp_3_1_2_springboot.services;

import ru.kata.pp_3_1_2_springboot.models.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    User getUserById(Integer id);
    void saveUser(User user);
    void updateUser(Integer id, User updatedUser);
    void deleteUser(Integer id);
}
