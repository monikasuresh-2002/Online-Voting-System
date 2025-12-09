package com.example.demo.controller;

import com.example.demo.entity.Election;
import com.example.demo.service.ElectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/elections")
public class ElectionController {

    @Autowired
    private ElectionService electionService;

    @GetMapping
    public List<Election> getAllElections() {
        return electionService.getAllElections();
    }

    @GetMapping("/{id}")
    public Optional<Election> getElectionById(@PathVariable int id) {
        return electionService.getElectionById(id);
    }

    @PostMapping
    public Election saveElection(@RequestBody Election election) {
        return electionService.saveElection(election);
    }

    @DeleteMapping("/{id}")
    public void deleteElection(@PathVariable int id) {
        electionService.deleteElection(id);
    }
}
