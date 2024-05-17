package com.ggomez.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ggomez.apirest.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

}
