package com.jasontyzzer.javatodos.repos;

import com.jasontyzzer.javatodos.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer>
{
    Users findByUsername(String username);
}