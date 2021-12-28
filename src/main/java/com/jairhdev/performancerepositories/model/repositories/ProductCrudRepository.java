package com.jairhdev.performancerepositories.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jairhdev.performancerepositories.model.entities.Product;

@Repository
public interface ProductCrudRepository extends CrudRepository<Product, Long> {
}
