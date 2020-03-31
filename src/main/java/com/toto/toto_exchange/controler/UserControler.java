package com.toto.toto_exchange.controler;

import com.toto.toto_exchange.service.UserServiceDB;
import com.toto.toto_exchange.model.entity.User;
import com.toto.toto_exchange.model.entity.UserAuth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class UserControler {

    @Autowired
    UserServiceDB userModel;

    @PostMapping("/user/add")
    private long create(@RequestParam String userName, @RequestParam String password, @RequestParam UserAuth auth){
        User u = new User();
        u.setUsername(userName);
        u.setPassword(password);
        u.setAuthority(auth);
        return userModel.add(u);
    }
    @PutMapping("/user/edit")
    User edit(@RequestBody User user){
        return userModel.edit(user).orElseThrow(() -> new IllegalArgumentException("User not found"));
    }

    @GetMapping("/user/read")
    Iterable<User> getAll(){
        return userModel.getAll();
    }

    @DeleteMapping("/user/delete")
    void deleteUser(long id){
        userModel.delete(id);
    }

    @GetMapping("/user/name")
    Collection<User> getByName(String username){
        return userModel.getByName(username);
    }
}
