package com.entity;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name="restaurant")
public class RestaurantEntity {
	
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
Integer restaurantId;

//validation-@pattern

@NotBlank(message="please enter restaurant name !")
@Pattern(regexp = "[a-zA-Z]+", message="please enter valid name !")
String name;

//validation- @notblank

@NotBlank(message="please enter restaurant address !")
String address;

//validation -@length

@NotBlank(message="please enter restaurant category !")
@Length( min= 3 ,max = 20,message="enter valid length !" )
String category;


public Integer getRestaurantId() {
	return restaurantId;
}
public void setRestaurantId(Integer restaurantId) {
	this.restaurantId = restaurantId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}

}
