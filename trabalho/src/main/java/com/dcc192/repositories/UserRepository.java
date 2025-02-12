package com.dcc192.repositories;

import com.dcc192.models.User;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    default void excluiPeloId(Long id){
        if (existsById(id)) {
            deleteById(id);
        } else {
            throw new RuntimeException("Usuário não encontrado com ID: " + id);
        }
    }
}
