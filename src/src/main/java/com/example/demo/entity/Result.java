package com.example.demo.entity;



import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Result")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int resultId;

    @ManyToOne
    @JoinColumn(name = "candidate_id", referencedColumnName = "candidateId")
    private Candidate candidate;

    @ManyToOne
    @JoinColumn(name = "party_id", referencedColumnName = "partyId")
    private Party party;

    @ManyToOne
    @JoinColumn(name = "district_id", referencedColumnName = "districtId")
    private Address district;

    @Column(nullable = false)
    private int voteCount;

	public int getResultId() {
		return resultId;
	}

	public void setResultId(int resultId) {
		this.resultId = resultId;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	public Party getParty() {
		return party;
	}

	public void setParty(Party party) {
		this.party = party;
	}

	public Address getDistrict() {
		return district;
	}

	public void setDistrict(Address district) {
		this.district = district;
	}

	public int getVoteCount() {
		return voteCount;
	}

	public void setVoteCount(int voteCount) {
		this.voteCount = voteCount;
	}
    
}
