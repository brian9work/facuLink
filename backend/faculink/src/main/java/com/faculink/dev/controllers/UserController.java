package com.faculink.dev.controllers;

import com.faculink.dev.models.UserModel;
import com.faculink.dev.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserModel> getUsers() {
        return this.userService.getUser();
    }

//    @PostMapping
//    public UserModel saveUser(@RequestBody UserModel user) {
//        return this.userService.saveUser(user);
//    }

    @GetMapping(path = "/{id}")
    public Optional<UserModel> getUserById(@PathVariable Long id) {
        return this.userService.getById(id);
    }

//    @PutMapping(path = "/{id}")
//    public UserModel updateUser(@RequestBody UserModel user, @PathVariable Long id) {
//        return this.userService.updateUser(user, id);
//    }
//
//    @DeleteMapping(path = "/{id}")
//    public String deleteUser(@PathVariable Long id) {
//        return this.userService.deleteUser(id) ?
//                "Eliminado el usuario con el" + id :
//                "Error al eliminar al usuario" + id;
//    }
}
