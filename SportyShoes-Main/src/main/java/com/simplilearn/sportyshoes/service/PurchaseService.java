 package com.simplilearn.sportyshoes.service;


import com.simplilearn.sportyshoes.models.Purchase;
import com.simplilearn.sportyshoes.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseService {

    @Autowired
    PurchaseRepository purchaseRepository;

    public List<Purchase> getPurchaseData(){
        return purchaseRepository.findAll();
    }

    public List<Purchase> getPurchaseDataSortedWithName(){
        return purchaseRepository.findAllOrderByFirstName();
    }

    public List<Purchase> getPurchaseDataSortedWithPrice(){
        return purchaseRepository.findAllOrderByPrice();
    }

    public void savePurchaseData(Purchase purchase){
        purchaseRepository.save(purchase);
    }
}
