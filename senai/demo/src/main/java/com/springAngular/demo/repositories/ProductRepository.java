package com.springAngular.demo.repositories;

import com.springAngular.demo.models.Products;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductsRepository extends MongoRepository<Products, String> {

    @Override
    void delete(Products deleted);

}

