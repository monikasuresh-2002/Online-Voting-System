package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Candidate_Type")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CandidateType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int candidateTypeId;

    @Column(nullable = false)
    private String candidateType;

	public int getCandidateTypeId() {
		return candidateTypeId;
	}

	public void setCandidateTypeId(int candidateTypeId) {
		this.candidateTypeId = candidateTypeId;
	}

	public String getCandidateType() {
		return candidateType;
	}

	public void setCandidateType(String candidateType) {
		this.candidateType = candidateType;
	}
    
}
