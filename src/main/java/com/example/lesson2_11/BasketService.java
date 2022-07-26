package com.example.lesson2_11;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BasketService {
    private List<Integer> products = new ArrayList<>();

    public List <Basket> addProduct(int id) {
        List <Basket> ba = new ArrayList<Basket>();
         products.add(id);
        return ba;
    }

    public List <Basket> getProduct (){
        List <Basket> baGet = new ArrayList <>();
        for (int i : products) {
            baGet = new ArrayList<>(products.get(i));
        }
        return baGet;
    }

}
