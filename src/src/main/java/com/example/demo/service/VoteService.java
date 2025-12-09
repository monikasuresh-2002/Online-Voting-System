package com.example.demo.service;

import com.example.demo.entity.Vote;
import com.example.demo.repository.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VoteService {

    @Autowired
    private VoteRepository voteRepository;

    public List<Vote> getAllVotes() {
        return voteRepository.findAll();
    }

    public Optional<Vote> getVoteById(int id) {
        return voteRepository.findById(id);
    }

    public Vote saveVote(Vote vote) {
        return voteRepository.save(vote);
    }

    public void deleteVote(int id) {
        voteRepository.deleteById(id);
    }
}
