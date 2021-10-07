package mirea.web.lab1.service;

import mirea.web.lab1.dto.ItemToCartRequest;
import mirea.web.lab1.dto.CreateItemRequest;
import mirea.web.lab1.dto.ItemDto;

import java.util.List;
import java.util.UUID;

public interface HttpService {
    List getItems();

    ItemDto getItem(UUID id);

    List getCart(UUID user_id);

    void addItem(CreateItemRequest request);

    void delItem(UUID id);

    void addItemToCart(UUID user_id, ItemToCartRequest request);

    void delItemFromCart(UUID user_id, ItemToCartRequest request);
}
