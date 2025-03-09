package com.faculink.faculink.repositories;

import com.faculink.faculink.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepository  extends JpaRepository<UserModel, Integer> {
    Optional<UserModel> findById(Long id);
    Boolean deleteById(Long id);
}
