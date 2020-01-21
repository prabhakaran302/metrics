package com.metrics.account.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Account {
	@Id
	private Long id;
}
