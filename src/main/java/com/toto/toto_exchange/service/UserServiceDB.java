package com.toto.toto_exchange.service;

import com.toto.toto_exchange.model.entity.User;
import com.toto.toto_exchange.model.model.UserMod;
import com.toto.toto_exchange.service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceDB implements UserMod {

    @Autowired
    UserRepository userRepository;


    @Override
    public Optional<User> get(long id) {
        return userRepository.findById(id);
    }

    @Override
    public Iterable<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public long add(User user) {
        //TODO whatif same name
        User u = userRepository.save(user);
        return u.getId();
    }

    @Override
    public Optional<User> edit(User user) {
        return userRepository.existsById(user.getId()) ? Optional.of(userRepository.save(user)) : Optional.empty();
    }

    @Override
    public void delete(long id) {
        userRepository.findById(id).ifPresent(user -> userRepository.delete(user));
    }

    public Collection<User> getByName(String username){
        return userRepository.getByName(username);
    }
}
