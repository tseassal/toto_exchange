package com.toto.toto_exchange.model.model;

import com.toto.toto_exchange.model.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserMod {
    Optional<User> get(long id);
    Iterable<User> getAll();
    long add(User user);
    Optional<User> edit(User user);
    void delete(long id);
}
