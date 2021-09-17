package mirea.web.lab1.service;

import mirea.web.lab1.dto.ItemToCartRequest;
import mirea.web.lab1.dto.CreateItemRequest;
import mirea.web.lab1.dto.Item;

import java.util.List;

public interface HttpService {
    List getItems();

    Item getItem(Integer id);

    List getCart();

    void addItem(CreateItemRequest request);

    void delItem(Integer id);

    void addItemToCart(ItemToCartRequest request);

    void delItemFromCart(ItemToCartRequest request);
}
