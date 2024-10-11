package com.entity.onetomany;

import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name="Customers")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class customerEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer	customerId;
	String firstName;
	String gender;
	
	
	@OneToMany
	List<orderEntity> order;

	
}
