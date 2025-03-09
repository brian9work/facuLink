package com.faculink.faculink.services;

import com.faculink.faculink.models.UserModel;
import com.faculink.faculink.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    IUserRepository userRepository;

    public List<UserModel> getUser(){
        return userRepository.findAll();
    }
    public UserModel saveUser(UserModel user){
        return userRepository.save(user);
    }
    public Optional<UserModel> getById(Long id){
        return userRepository.findById(id);
    }
    public UserModel updateUser(UserModel request, Long id){
        UserModel user = userRepository.findById(id).get();

        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        user.setImagen(request.getImagen());
        user.setReference(request.getReference());

        userRepository.save(user);

        return user;
    }
    public Boolean deleteUser(Long id){
        try {
            userRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
