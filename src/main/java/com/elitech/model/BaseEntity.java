package com.elitech.model;

import java.time.LocalDateTime;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Data;

@Data
@MappedSuperclass
public abstract class BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
private LocalDateTime createdAt;
private LocalDateTime updatedAt;
@PrePersist
public void init()
{
createdAt=updatedAt=LocalDateTime.now();	
}
@PreUpdate
public void onUpdate()
{
updatedAt=LocalDateTime.now();
}
}
