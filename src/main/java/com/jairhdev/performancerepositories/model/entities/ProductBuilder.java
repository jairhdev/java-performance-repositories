package com.jairhdev.performancerepositories.model.entities;

import java.util.ArrayList;
import java.util.List;

public class ProductBuilder {

	private List<Product> products = new ArrayList<>();

	public ProductBuilder(int quantity) {
		for (int i = 1; i <= quantity; i++) {
			products.add(new Product("name" + i));
		}
	}

	public List<Product> getProducts() {
		return products;
	}

}
