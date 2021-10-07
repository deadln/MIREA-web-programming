package mirea.web.lab1.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.val;
import mirea.web.lab1.dto.CartItemDto;
import mirea.web.lab1.dto.CreateItemRequest;
import mirea.web.lab1.dto.ItemDto;
import mirea.web.lab1.dto.ItemToCartRequest;
import mirea.web.lab1.entity.CartItem;
import mirea.web.lab1.entity.Item;
import mirea.web.lab1.repository.CartRepository;
import mirea.web.lab1.repository.ItemRepository;
import mirea.web.lab1.service.HttpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@Slf4j
@RequiredArgsConstructor
public class HttpServiceImpl implements HttpService {

    private final ItemRepository itemRepository;
    private final CartRepository cartRepository;


    @Override
    public List getItems(){
        log.info("Get catalog");

        return StreamSupport.stream(itemRepository.findAll().spliterator(), false)
                .map(resource -> ItemDto.builder()
                        .id(resource.getId())
                        .name(resource.getName())
                        .description(resource.getDescription())
                        .price(resource.getPrice())
                        .build())
                .collect(Collectors.toList());
    }

    @Override
    public ItemDto getItem(UUID id){
        log.info("Get item with id " + id.toString());
        val resource = itemRepository.findById(id);

        if (resource.isPresent()) {
            return ItemDto.builder()
                    .id(resource.get().getId())
                    .name(resource.get().getName())
                    .description(resource.get().getDescription())
                    .price(resource.get().getPrice())
                    .build();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found");
        }

    }

    @Override
    public List getCart(UUID user_id){
        log.info("Get cart");
        return StreamSupport.stream(cartRepository.findAll().spliterator(), false)
                .filter(resource -> resource.getUser_id().equals(user_id))
                .map(resource -> CartItemDto.builder()
                        .id(resource.getId())
                        .user_id(resource.getUser_id())
                        .item_id(resource.getItem_id())
                        .build())
                .collect(Collectors.toList());
    }

    @Override
    public void addItem(CreateItemRequest request) {
        log.info("Get item with name " + request.getName());
        val resource = Item.builder()
                .name(request.getName())
                .description(request.getDescription())
                .price(request.getPrice())
                .build();

        itemRepository.save(resource);
    }

    @Override
    public void delItem(UUID id) {
        log.info("Delete item with id " + id.toString());

        val resource = itemRepository.findById(id);

        if (resource.isPresent()) {
            itemRepository.deleteById(id);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found");
        }
    }

    @Override
    public void addItemToCart(UUID user_id, ItemToCartRequest request){
        log.info("Add item to cart with id " + request.getId().toString());

        val resource = CartItem.builder()
                .user_id(user_id)
                .item_id(request.getId())
                .build();

        cartRepository.save(resource);
    }

    public void delItemFromCart(UUID user_id, ItemToCartRequest request){
        log.info("Delete item from cart with id " + request.getId().toString());

        val resource = cartRepository.findById(request.getId());

        if (resource.isPresent() && resource.get().getUser_id().equals(user_id)) {
            cartRepository.deleteById(request.getId());
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found");
        }
    }

}
