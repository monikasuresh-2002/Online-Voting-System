package com.example.demo.entity;




import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Vote_Table")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int voteId;

    @OneToOne
    @JoinColumn(name = "voter_id", referencedColumnName = "voterID", unique = true)
    private User voter;

    @ManyToOne
    @JoinColumn(name = "party_id", referencedColumnName = "partyID")
    private Party party;

    @ManyToOne
    @JoinColumn(name = "candidate_id", referencedColumnName = "candidateID")
    private Candidate candidate;

    @ManyToOne
    @JoinColumn(name = "district_id", referencedColumnName = "districtID")
    private Address district;

    @Column(nullable = false)
    private String defaultPassword;

    @Column(nullable = false)
    private String passwordEntered;

	public int getVoteId() {
		return voteId;
	}

	public void setVoteId(int voteId) {
		this.voteId = voteId;
	}

	public User getVoter() {
		return voter;
	}

	public void setVoter(User voter) {
		this.voter = voter;
	}

	public Party getParty() {
		return party;
	}

	public void setParty(Party party) {
		this.party = party;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	public Address getDistrict() {
		return district;
	}

	public void setDistrict(Address district) {
		this.district = district;
	}

	public String getDefaultPassword() {
		return defaultPassword;
	}

	public void setDefaultPassword(String defaultPassword) {
		this.defaultPassword = defaultPassword;
	}

	public String getPasswordEntered() {
		return passwordEntered;
	}

	public void setPasswordEntered(String passwordEntered) {
		this.passwordEntered = passwordEntered;
	}
    
}
