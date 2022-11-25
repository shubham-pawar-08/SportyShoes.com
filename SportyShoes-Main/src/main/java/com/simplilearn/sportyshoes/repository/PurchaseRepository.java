package com.simplilearn.sportyshoes.repository;

import com.simplilearn.sportyshoes.models.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PurchaseRepository extends JpaRepository<Purchase,Integer> {


    @Query(value = "SELECT p FROM Purchase p ORDER BY p.firstName ASC")
    List<Purchase> findAllOrderByFirstName();

    @Query(value = "SELECT p FROM Purchase p ORDER BY p.price ASC")
    List<Purchase> findAllOrderByPrice();
}

