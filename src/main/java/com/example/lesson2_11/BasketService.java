package com.example.lesson2_11;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Scope ("prototype")
public class BasketService {
    private List<Integer> products = new ArrayList<>();

    public Basket addProduct(int id) {
        Basket ba = new Basket(id);
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i) == null) {
                products.add(i, id);
            }
        }
        return ba;
    }
    public List <Basket> getProduct (){
        for (int i = 0; i < products.size(); i++) {
        }
        return new ArrayList<>(products.get(i));
    }
}
