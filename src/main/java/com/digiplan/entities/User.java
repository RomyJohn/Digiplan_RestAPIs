package com.digiplan.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@Entity
@JsonIgnoreProperties(value = { "handler", "hibernateLazyInitializer", "FieldHandler" })
@NoArgsConstructor
@Table(name = "alignwise_users")
public class User {

	private String username;
	private String password;
	private String city;
	private String firstname;
	private String lastname;
	private String email;
	private Long phoneNumber;
	private String typeofUser;
	private String createdBy;
	private String groupId;
	private String clinicName;
	private String buildingNo;
	private String street;
	private String state;
	private String pin;
	private String latitude;
	private String longitude;
	private String ttWattsProvider;
	private String promoted;
	private String address;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Integer id;

}