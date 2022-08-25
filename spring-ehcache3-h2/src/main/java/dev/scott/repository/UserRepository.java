package dev.scott.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.scott.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
