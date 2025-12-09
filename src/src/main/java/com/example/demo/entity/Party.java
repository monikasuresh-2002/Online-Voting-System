package com.example.demo.entity;





import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Party_Table")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Party {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int partyId;

    @Column(nullable = false, unique = true)
    private String partyName;

    @Column(nullable = false, unique = true)
    private String symbol;

    @Column(nullable = false)
    private String partyLeader;

	public int getPartyId() {
		return partyId;
	}

	public void setPartyId(int partyId) {
		this.partyId = partyId;
	}

	public String getPartyName() {
		return partyName;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getPartyLeader() {
		return partyLeader;
	}

	public void setPartyLeader(String partyLeader) {
		this.partyLeader = partyLeader;
	}
    
}
