package com.example.demo.entity;




import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Candidate_Table")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int candidateId;

    @ManyToOne
    @JoinColumn(name = "aadhaar", referencedColumnName = "aadhaar")
    private Voter voter;

    @ManyToOne
    @JoinColumn(name = "candidate_type_id", referencedColumnName = "candidateTypeId")
    private CandidateType candidateType;

    @ManyToOne
    @JoinColumn(name = "party_id", referencedColumnName = "partyId")
    private Party party;

    @ManyToOne
    @JoinColumn(name = "election_id", referencedColumnName = "electionId")
    private Election election;

    @ManyToOne
    @JoinColumn(name = "district_id", referencedColumnName = "districtId")
    private Address district;

	public int getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}

	public Voter getVoter() {
		return voter;
	}

	public void setVoter(Voter voter) {
		this.voter = voter;
	}

	public CandidateType getCandidateType() {
		return candidateType;
	}

	public void setCandidateType(CandidateType candidateType) {
		this.candidateType = candidateType;
	}

	public Party getParty() {
		return party;
	}

	public void setParty(Party party) {
		this.party = party;
	}

	public Election getElection() {
		return election;
	}

	public void setElection(Election election) {
		this.election = election;
	}

	public Address getDistrict() {
		return district;
	}

	public void setDistrict(Address district) {
		this.district = district;
	}
    
}
