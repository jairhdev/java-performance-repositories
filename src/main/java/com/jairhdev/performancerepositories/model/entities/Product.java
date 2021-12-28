package com.jairhdev.performancerepositories.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE) // melhor para postgres
	private Long id;

	private String name;

	public Product() {
	}

	public Product(String name) {
		this.name = name;
	}

	// ******************************

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
