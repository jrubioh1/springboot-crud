package com.jorge.curso.springboot.app.springboot_crud.servicies;

import java.util.List;
import java.util.Optional;

import com.jorge.curso.springboot.app.springboot_crud.entities.Product;


public interface IProductService {

    List<Product> findAll();
    Optional<Product> findById(Long id);
    Product save(Product product);
    Optional <Product> update(Long id, Product product );
    Optional<Product>  delete(Long id);
    boolean existsBySku(String sku);
    

}
