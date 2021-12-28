package com.jairhdev.performancerepositories.model.services;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jairhdev.performancerepositories.model.entities.ProductBuilder;
import com.jairhdev.performancerepositories.model.entities.Request;
import com.jairhdev.performancerepositories.model.entities.Result;
import com.jairhdev.performancerepositories.model.repositories.ProductCrudRepository;
import com.jairhdev.performancerepositories.model.repositories.ProductJpaRepository;

@Service
public class ProductServiceV1 {

	@Autowired
	private ProductJpaRepository jpaRepository;

	@Autowired
	private ProductCrudRepository crudRepository;

	// JPA
	public Result saveJpa(Request request) {
		ProductBuilder productBuilder = new ProductBuilder(request.getQuantitySave());

		LocalTime timeStart = LocalTime.now();
		jpaRepository.saveAll(productBuilder.getProducts());
		LocalTime timeEnd = LocalTime.now();

		return new Result(request.getQuantitySave(), timeStart, timeEnd);
	}

	// CRUD
	public Result saveCrud(Request request) {
		ProductBuilder productBuilder = new ProductBuilder(request.getQuantitySave());

		LocalTime timeStart = LocalTime.now();
		crudRepository.saveAll(productBuilder.getProducts());
		LocalTime timeEnd = LocalTime.now();

		return new Result(request.getQuantitySave(), timeStart, timeEnd);
	}

}
