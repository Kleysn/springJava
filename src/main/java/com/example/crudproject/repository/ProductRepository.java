package com.example.crudproject.repository;

import com.example.crudproject.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Métodos personalizados podem ser adicionados aqui, se necessário
}
