package com.entity.manytomany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name="employee")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EmployeeEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer employeeId;
	String firstName;
	@ManyToMany(mappedBy = "employees")
	List<ProjectEntity> projects;
}
