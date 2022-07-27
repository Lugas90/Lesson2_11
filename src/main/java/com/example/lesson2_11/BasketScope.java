package com.example.lesson2_11;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Component
@SessionScope
public class BasketScope {
    private final List<Integer> products = new ArrayList<>();

    public List <Integer> addProduct(Integer id) {
        products.add(id);
        return products;
    }

    public List <Integer> getProduct (){
        return new ArrayList<>(products);
    }

}
