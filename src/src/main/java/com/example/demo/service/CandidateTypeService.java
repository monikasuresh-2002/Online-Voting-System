package com.example.demo.service;

import com.example.demo.entity.CandidateType;
import com.example.demo.repository.CandidateTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CandidateTypeService {

    @Autowired
    private CandidateTypeRepository candidateTypeRepository;

    public List<CandidateType> getAllCandidateTypes() {
        return candidateTypeRepository.findAll();
    }

    public Optional<CandidateType> getCandidateTypeById(int id) {
        return candidateTypeRepository.findById(id);
    }

    public CandidateType saveCandidateType(CandidateType candidateType) {
        return candidateTypeRepository.save(candidateType);
    }

    public void deleteCandidateType(int id) {
        candidateTypeRepository.deleteById(id);
    }
}
