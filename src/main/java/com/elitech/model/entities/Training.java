package com.elitech.model.entities;

import java.util.Set;

import com.elitech.model.BaseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Training extends BaseEntity{
	private String title;
	private int duration;
	private double price;
	@ManyToMany(mappedBy = "trainings",fetch = FetchType.EAGER)
	private Set<Employee> employees;

}
