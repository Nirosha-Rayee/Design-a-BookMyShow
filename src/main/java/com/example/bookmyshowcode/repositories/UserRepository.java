package com.example.bookmyshowcode.repositories;

import com.example.bookmyshowcode.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Override
    Optional<User> findById(Long id);

    @Override
    User save(User user);

    Optional<User> findByEmail(String email);

    Optional<User> findByUsername(String username);

}
