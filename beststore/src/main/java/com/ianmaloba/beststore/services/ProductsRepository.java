package com.ianmaloba.beststore.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ianmaloba.beststore.models.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer> {

}
