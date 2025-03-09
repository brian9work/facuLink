package com.faculink.dev.repositories;

import com.faculink.dev.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepository  extends JpaRepository<UserModel, Integer> {
    Optional<UserModel> findById(Long id);
    Boolean deleteById(Long id);
}
