package com.example.demo.controller;

import com.example.demo.entity.Party;
import com.example.demo.service.PartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/parties")
public class PartyController {

    @Autowired
    private PartyService partyService;

    @GetMapping
    public List<Party> getAllParties() {
        return partyService.getAllParties();
    }

    @GetMapping("/{id}")
    public Optional<Party> getPartyById(@PathVariable int id) {
        return partyService.getPartyById(id);
    }

    @PostMapping
    public Party saveParty(@RequestBody Party party) {
        return partyService.saveParty(party);
    }

    @DeleteMapping("/{id}")
    public void deleteParty(@PathVariable int id) {
        partyService.deleteParty(id);
    }
}
