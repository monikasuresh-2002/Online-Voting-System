package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "User_Table")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    private String voterId;

    @Column(nullable = false)
    private String defPassword;

    @Column(nullable = false)
    private boolean isActive;

    @ManyToOne
    @JoinColumn(name = "aadhaar", referencedColumnName = "aadhaar")
    private Voter voter;

    @ManyToOne
    @JoinColumn(name = "user_type_id", referencedColumnName = "userTypeId")
    private UserType userType;

	public String getVoterId() {
		return voterId;
	}

	public void setVoterId(String voterId) {
		this.voterId = voterId;
	}

	public String getDefPassword() {
		return defPassword;
	}

	public void setDefPassword(String defPassword) {
		this.defPassword = defPassword;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Voter getVoter() {
		return voter;
	}

	public void setVoter(Voter voter) {
		this.voter = voter;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}
    
}
