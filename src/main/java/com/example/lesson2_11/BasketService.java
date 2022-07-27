package com.example.lesson2_11;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketService {
    private final BasketScope basketScope;
    public BasketService (BasketScope basketScope){
        this.basketScope = basketScope;
    }

    public List <Integer> addProduct (Integer id) {
        return basketScope.addProduct(id);
    }
    public List<Integer> getProduct (){
        return basketScope.getProduct();
    }

}
