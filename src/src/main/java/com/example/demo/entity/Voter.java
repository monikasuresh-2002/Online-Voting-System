package com.example.demo.entity;



import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Voter_Table")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Voter {

    @Id
    private String aadhaar;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String sex;

    @Column(nullable = false)
    private String birthday;

    @Column(nullable = false)
    private int age;

    @ManyToOne
    @JoinColumn(name = "district_id", referencedColumnName = "districtId")
    private Address district;

    @Column(nullable = false)
    private String phone;

	public String getAadhaar() {
		return aadhaar;
	}

	public void setAadhaar(String aadhaar) {
		this.aadhaar = aadhaar;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getDistrict() {
		return district;
	}

	public void setDistrict(Address district) {
		this.district = district;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
    
}
