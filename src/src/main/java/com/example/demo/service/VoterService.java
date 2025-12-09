package com.example.demo.service;

import com.example.demo.entity.Voter;
import com.example.demo.repository.VoterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VoterService {

    @Autowired
    private VoterRepository voterRepository;

    public List<Voter> getAllVoters() {
        return voterRepository.findAll();
    }

    public Optional<Voter> getVoterByAadhaar(String aadhaar) {
        return voterRepository.findById(aadhaar);
    }

    public Voter saveVoter(Voter voter) {
        return voterRepository.save(voter);
    }

    public void deleteVoter(String aadhaar) {
        voterRepository.deleteById(aadhaar);
    }
}
