package dev.cross.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import dev.cross.model.Product;

@Repository
public interface ProductDAO extends JpaRepository<Product, Integer> {

}
