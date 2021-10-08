package mirea.web.lab1.controller;

import lombok.RequiredArgsConstructor;
import mirea.web.lab1.dto.CartItemDto;
import mirea.web.lab1.dto.ItemToCartRequest;
import mirea.web.lab1.dto.CreateItemRequest;
import mirea.web.lab1.dto.ItemDto;
import mirea.web.lab1.service.HttpService;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequiredArgsConstructor
public class MainController {

    private final HttpService service;

    @GetMapping("/items")
    public CollectionModel<ItemDto> getItems(){
        List<ItemDto> items = service.getItems();
        for(final ItemDto item : items){
            Link selfLink = linkTo(methodOn(MainController.class).getItem(item.getId())).withSelfRel();
            item.add(selfLink);
        }

        Link link = linkTo(methodOn(MainController.class).getItems()).withSelfRel();
        CollectionModel<ItemDto> result = CollectionModel.of(items, link);
        return result;
    }// cart/c74963c4-5e34-4992-bd03-a31d249cc7a7

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
