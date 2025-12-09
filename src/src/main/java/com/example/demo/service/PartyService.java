package com.example.demo.service;

import com.example.demo.entity.Party;
import com.example.demo.repository.PartyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PartyService {

    @Autowired
    private PartyRepository partyRepository;

    public List<Party> getAllParties() {
        return partyRepository.findAll();
    }

    public Optional<Party> getPartyById(int id) {
        return partyRepository.findById(id);
    }

    public Party saveParty(Party party) {
        return partyRepository.save(party);
    }

    public void deleteParty(int id) {
        partyRepository.deleteById(id);
    }
}
