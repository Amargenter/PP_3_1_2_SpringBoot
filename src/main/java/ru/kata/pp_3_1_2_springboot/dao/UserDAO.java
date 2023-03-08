package ru.kata.pp_3_1_2_springboot.dao;

import ru.kata.pp_3_1_2_springboot.models.User;

import java.util.List;

public interface UserDAO {

    List<User> getAllUsers();
    User getUserById(Integer id);
    void saveUser(User user);
    void updateUser(Integer id, User updatedUser);
    void deleteUser(Integer id);
}
