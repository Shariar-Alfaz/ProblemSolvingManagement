package com.saproduction.problemsolvingmanagement.application.feature.repositories;

import com.saproduction.problemsolvingmanagement.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}