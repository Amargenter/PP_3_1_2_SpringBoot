package ru.kata.pp_3_1_2_springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kata.pp_3_1_2_springboot.dao.UserDAO;
import ru.kata.pp_3_1_2_springboot.models.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    @Transactional(readOnly = true)
    public User getUserById(Integer id) {
        return userDAO.getUserById(id);
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }

    @Override
    @Transactional
    public void updateUser(Integer id, User updatedUser) {
        userDAO.updateUser(id, updatedUser);
    }

    @Override
    @Transactional
    public void deleteUser(Integer id) {
        userDAO.deleteUser(id);
    }
}
