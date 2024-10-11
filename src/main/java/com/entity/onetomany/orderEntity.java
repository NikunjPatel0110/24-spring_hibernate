package com.entity.onetomany;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
@Entity
@Table(name="orders")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class orderEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer	orderId;
	String	date;
	Float	amount;


	@ManyToOne  //we need to mention do not create table
	@JoinColumn(name = "customerId")
	customerEntity customer;
}

