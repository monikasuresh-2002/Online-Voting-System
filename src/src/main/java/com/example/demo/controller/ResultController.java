package com.example.demo.controller;

import com.example.demo.entity.Result;
import com.example.demo.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/results")
public class ResultController {

    @Autowired
    private ResultService resultService;

    @GetMapping
    public List<Result> getAllResults() {
        return resultService.getAllResults();
    }

    @GetMapping("/{id}")
    public Optional<Result> getResultById(@PathVariable int id) {
        return resultService.getResultById(id);
    }

    @PostMapping
    public Result saveResult(@RequestBody Result result) {
        return resultService.saveResult(result);
    }

    @DeleteMapping("/{id}")
    public void deleteResult(@PathVariable int id) {
        resultService.deleteResult(id);
    }
}
