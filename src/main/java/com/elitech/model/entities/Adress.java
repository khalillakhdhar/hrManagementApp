package com.elitech.model.entities;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
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
public class Adress {

	@Id
	private long id;
	private String city;
	private String country;
	private String pc;
	private String fullAdress;
	@MapsId
	@OneToOne(optional = false,cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	private Employee employee;
}
