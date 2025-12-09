package com.example.demo.entity;




import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Election_Table")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Election {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int electionId;

    @Column(nullable = false)
    private String electionType;

	public int getElectionId() {
		return electionId;
	}

	public void setElectionId(int electionId) {
		this.electionId = electionId;
	}

	public String getElectionType() {
		return electionType;
	}

	public void setElectionType(String electionType) {
		this.electionType = electionType;
	}
    
}
