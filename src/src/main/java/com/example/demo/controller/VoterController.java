package com.example.demo.controller;

import com.example.demo.entity.Voter;
import com.example.demo.service.VoterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/voters")
public class VoterController {

    @Autowired
    private VoterService voterService;

    @GetMapping
    public List<Voter> getAllVoters() {
        return voterService.getAllVoters();
    }

    @GetMapping("/{aadhaar}")
    public Optional<Voter> getVoterByAadhaar(@PathVariable String aadhaar) {
        return voterService.getVoterByAadhaar(aadhaar);
    }

    @PostMapping
    public Voter saveVoter(@RequestBody Voter voter) {
        return voterService.saveVoter(voter);
    }

    @DeleteMapping("/{aadhaar}")
    public void deleteVoter(@PathVariable String aadhaar) {
        voterService.deleteVoter(aadhaar);
    }
}
