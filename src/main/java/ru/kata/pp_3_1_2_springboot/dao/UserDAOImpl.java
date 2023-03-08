package ru.kata.pp_3_1_2_springboot.dao;

import org.springframework.stereotype.Repository;
import ru.kata.pp_3_1_2_springboot.models.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<User> getAllUsers() {
        return em.createQuery("SELECT u FROM User u", User.class).getResultList();
    }

    @Override
    public User getUserById(Integer id) {
        return em.find(User.class, id);
    }

    @Override
    public void saveUser(User user) {
        em.persist(user);
    }

    @Override
    public void updateUser(Integer id, User updatedUser) {
        User user = em.find(User.class, id);
        user.setName(updatedUser.getName());
        user.setAge(updatedUser.getAge());
        user.setEmail(updatedUser.getEmail());
        em.persist(user);
    }

    @Override
    public void deleteUser(Integer id) {
        em.remove(em.find(User.class, id));
    }
}
