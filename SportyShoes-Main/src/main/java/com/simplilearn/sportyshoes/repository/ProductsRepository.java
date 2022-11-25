package com.simplilearn.sportyshoes.repository;

import com.simplilearn.sportyshoes.models.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductsRepository extends JpaRepository<Products,Long> {

    @Query(value = "SELECT p FROM Products p ORDER BY p.price Desc")
    public List<Products> findAllProductsOrderedByPriceHighToLow();

    @Query(value = "SELECT p FROM Products p ORDER BY p.price ASC")
    public List<Products> findAllProductsOrderedByPriceLowToHigh();


    Optional<Products> findById(Long id);
}
