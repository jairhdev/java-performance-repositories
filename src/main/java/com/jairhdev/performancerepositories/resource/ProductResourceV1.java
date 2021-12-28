package com.jairhdev.performancerepositories.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jairhdev.performancerepositories.model.entities.Request;
import com.jairhdev.performancerepositories.model.entities.Result;
import com.jairhdev.performancerepositories.model.services.ProductServiceV1;

@RestController
@RequestMapping(path = "/api/product/v1")
public class ProductResourceV1 {

	@Autowired
	private ProductServiceV1 service;

	@PostMapping(path = "/jpa")
	public ResponseEntity<Result> saveJpa(@RequestBody Request request) {
		return ResponseEntity.ok().body(service.saveJpa(request));
	}

	@PostMapping(path = "/crud")
	public ResponseEntity<Result> saveCrud(@RequestBody Request request) {
		return ResponseEntity.ok().body(service.saveCrud(request));
	}

}
