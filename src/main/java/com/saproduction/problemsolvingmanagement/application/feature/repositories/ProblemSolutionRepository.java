package com.saproduction.problemsolvingmanagement.application.feature.repositories;

import com.saproduction.problemsolvingmanagement.domain.entities.ProblemSolution;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProblemSolutionRepository extends JpaRepository<ProblemSolution, UUID> {
}