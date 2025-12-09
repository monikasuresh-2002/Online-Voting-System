package com.example.demo.controller;

import com.example.demo.entity.CandidateType;
import com.example.demo.service.CandidateTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/candidate-types")
public class CandidateTypeController {

    @Autowired
    private CandidateTypeService candidateTypeService;

    @GetMapping
    public List<CandidateType> getAllCandidateTypes() {
        return candidateTypeService.getAllCandidateTypes();
    }

    @GetMapping("/{id}")
    public Optional<CandidateType> getCandidateTypeById(@PathVariable int id) {
        return candidateTypeService.getCandidateTypeById(id);
    }

    @PostMapping
    public CandidateType saveCandidateType(@RequestBody CandidateType candidateType) {
        return candidateTypeService.saveCandidateType(candidateType);
    }

    @DeleteMapping("/{id}")
    public void deleteCandidateType(@PathVariable int id) {
        candidateTypeService.deleteCandidateType(id);
    }
}
