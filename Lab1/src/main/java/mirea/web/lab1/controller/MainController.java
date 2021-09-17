package mirea.web.lab1.controller;

import lombok.RequiredArgsConstructor;
import mirea.web.lab1.dto.ItemToCartRequest;
import mirea.web.lab1.dto.CreateItemRequest;
import mirea.web.lab1.dto.Item;
import mirea.web.lab1.service.HttpService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MainController {

    private final HttpService service;

    @GetMapping("/items")
    public List<Item> getItems(){
        return service.getItems();
    }

    @GetMapping("/items/{id}")
    public Item getItem(@PathVariable("id") Integer id){
        return service.getItem(id);
    }

    @GetMapping("/cart")
    public List<Item> getCart(){
        return service.getCart();
    }

    @PostMapping("/items")
    public void addItem(@RequestBody CreateItemRequest request) {
        service.addItem(request);
    }

    @DeleteMapping("/items/{id}")
    public void delItem(@PathVariable("id") Integer id) {
        service.delItem(id);
    }

    @PutMapping("/cart")
    public void addItemToCart(@RequestBody ItemToCartRequest request) {
        service.addItemToCart(request);
    }

    @DeleteMapping("/cart")
    public void delItemFromCart(@RequestBody ItemToCartRequest request) {
        service.delItemFromCart(request);
    }
}
