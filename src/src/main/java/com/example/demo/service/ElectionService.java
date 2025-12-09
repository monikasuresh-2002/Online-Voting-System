package com.example.demo.service;

import com.example.demo.entity.Election;
import com.example.demo.repository.ElectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ElectionService {

    @Autowired
    private ElectionRepository electionRepository;

    public List<Election> getAllElections() {
        return electionRepository.findAll();
    }

    public Optional<Election> getElectionById(int id) {
        return electionRepository.findById(id);
    }

    public Election saveElection(Election election) {
        return electionRepository.save(election);
    }

    public void deleteElection(int id) {
        electionRepository.deleteById(id);
    }
}
