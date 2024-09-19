package com.elitech.model.entities;

import java.util.Set;

import com.elitech.model.BaseEntity;
import com.elitech.model.enums.Gender;
import com.elitech.model.enums.Role;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
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
public class Employee extends BaseEntity {
@Column(nullable = false)
private String name;
@Column(nullable = false,unique = true)
private String email;
@Column(nullable = false)
private String password;
@Enumerated(EnumType.STRING)
@Column(nullable = false)
private Role role;
@Enumerated(EnumType.STRING)
@Column(nullable = false)
private Gender gender;
@Column(nullable = false)
private int age;
@OneToOne(mappedBy = "employee")
private Adress adress;
@ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})

private Set<Training> trainings;
}
