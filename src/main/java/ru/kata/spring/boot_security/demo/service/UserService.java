package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {

    User saveUser(User user);

    User findUserById(long id);

    List<User> getAllUsers();

    User updateUser(User updateUser);

    void deleteUser(long id);

    User findByEmail(String email);
}