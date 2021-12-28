package com.jairhdev.performancerepositories.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jairhdev.performancerepositories.model.entities.Product;

@Repository
public interface ProductJpaRepository extends JpaRepository<Product, Long> {
}
