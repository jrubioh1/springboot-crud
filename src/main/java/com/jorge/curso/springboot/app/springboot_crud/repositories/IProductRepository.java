package com.jorge.curso.springboot.app.springboot_crud.repositories;

import org.springframework.data.repository.CrudRepository;

import com.jorge.curso.springboot.app.springboot_crud.entities.Product;



public interface IProductRepository extends CrudRepository<Product,Long>{
    
    boolean existsBySku(String sku);//se auto implementa por usar la convencion estipulada en la documentacion de Springboot relacionada a las queries


}
