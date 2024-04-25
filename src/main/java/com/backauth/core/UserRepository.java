package com.backauth.core;

import com.backauth.core.interfaces.UserCrudRepository;
import com.backauth.core.dominio.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserRepository{
    @Autowired
    private UserCrudRepository userCrudRepository;

    public Optional<User> getUser(String userId)
    {
        return userCrudRepository.findById(userId);
    }

    public User save(User user)
    {
        return (User) userCrudRepository.save(user);
    }

    public User update(User user)
    {
        return (User) userCrudRepository.save(user);
    }

    public void delete(String userId)
    {
        userCrudRepository.deleteById(userId);
    }

    public Optional<User> findByUserEmail(String userEmail) {
        return userCrudRepository.findByUserEmail(userEmail);
    }
}
