package com.example.demo.service;

import com.example.demo.entity.Result;
import com.example.demo.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResultService {

    @Autowired
    private ResultRepository resultRepository;

    public List<Result> getAllResults() {
        return resultRepository.findAll();
    }

    public Optional<Result> getResultById(int id) {
        return resultRepository.findById(id);
    }

    public Result saveResult(Result result) {
        return resultRepository.save(result);
    }

    public void deleteResult(int id) {
        resultRepository.deleteById(id);
    }
}
