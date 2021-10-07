package mirea.web.lab1.controller;

import lombok.RequiredArgsConstructor;
import mirea.web.lab1.dto.CartItemDto;
import mirea.web.lab1.dto.ItemToCartRequest;
import mirea.web.lab1.dto.CreateItemRequest;
import mirea.web.lab1.dto.ItemDto;
import mirea.web.lab1.service.HttpService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class MainController {

    private final HttpService service;

    @GetMapping("/items")
    public List<ItemDto> getItems(){
        return service.getItems();
    }

    @GetMapping("/items/{id}")
    public ItemDto getItem(@PathVariable("id") UUID id){
        return service.getItem(id);
    }

    @GetMapping("/cart/{user_id}")
    public List<CartItemDto> getCart(@PathVariable("user_id") UUID user_id){
        return service.getCart(user_id);
    }

    @PostMapping("/items")
    public void addItem(@RequestBody CreateItemRequest request) {
        service.addItem(request);
    }

    @DeleteMapping("/items/{id}")
    public void delItem(@PathVariable("id") UUID id) {
        service.delItem(id);
    }

    @PutMapping("/cart/{user_id}")
    public void addItemToCart(@PathVariable("user_id") UUID user_id, @RequestBody ItemToCartRequest request) {
        service.addItemToCart(user_id, request);
    }

    @DeleteMapping("/cart/{user_id}")
    public void delItemFromCart(@PathVariable("user_id") UUID user_id, @RequestBody ItemToCartRequest request) {
        service.delItemFromCart(user_id, request);
    }
}
