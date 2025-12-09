package com.example.demo.controller;

import com.example.demo.entity.Candidate;
import com.example.demo.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/candidates")
public class CandidateController {

    @Autowired
    private CandidateService candidateService;

    @GetMapping
    public List<Candidate> getAllCandidates() {
        return candidateService.getAllCandidates();
    }

    @GetMapping("/{id}")
    public Optional<Candidate> getCandidateById(@PathVariable int id) {
        return candidateService.getCandidateById(id);
    }

    @PostMapping
    public Candidate saveCandidate(@RequestBody Candidate candidate) {
        return candidateService.saveCandidate(candidate);
    }

    @DeleteMapping("/{id}")
    public void deleteCandidate(@PathVariable int id) {
        candidateService.deleteCandidate(id);
    }
}
