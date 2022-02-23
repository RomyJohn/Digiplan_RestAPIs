package com.digiplan.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@Entity
@NoArgsConstructor
@Table(name = "boooking_dealer")
public class Dealer {

	@Id
	private Integer id;
	private String address;
	private String city;
	@Column(name = "drname")
	private String doctorName;
	private String clinicName;
	private String phoneNo;
	@Column(name = "emailId")
	private String email;
	private String longitude;
	private String latitude;
	private String type;
	private String building;
	private String street;
	private String cityEnter;
	private String state;
	private String pin;

}
