package com.example.lesson2_11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(value = "/order")
public class BasketController {

    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping(value = "/add")
    public Basket addProduct (@RequestParam("id")Integer id) {
        return basketService.addProduct(id);
    }

    @GetMapping (value = "/get")
    public List<Basket> getProduct (){
        return basketService.getProduct();
    }

}
