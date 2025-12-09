package com.example.demo.repository;


import com.example.demo.entity.CandidateType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateTypeRepository extends JpaRepository<CandidateType, Integer> {
}
