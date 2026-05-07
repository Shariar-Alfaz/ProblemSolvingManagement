package com.saproduction.problemsolvingmanagement.application.feature.repositories;

import com.saproduction.problemsolvingmanagement.domain.entities.Problem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProblemRepository extends JpaRepository<Problem, UUID> {
}