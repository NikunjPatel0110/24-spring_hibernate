package com.entity.manytomany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name="project")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProjectEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer projectId;
	String title;
	String technology;
	@ManyToMany
	@JoinTable(name="project_employee",joinColumns = @JoinColumn(name="projectId"),inverseJoinColumns = @JoinColumn(name="employeeId"))
	List<EmployeeEntity> employees;
}
