package mirea.web.lab1.service.impl;

import mirea.web.lab1.dto.CreateItemRequest;
import mirea.web.lab1.dto.Item;
import mirea.web.lab1.dto.ItemToCartRequest;
import mirea.web.lab1.service.HttpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class HttpServiceImpl implements HttpService {

    @Autowired
    private List<Item> items;
    private final List<Item> cart = new ArrayList<>();


    @Override
    public List getItems(){
        log.info("Get catalog");

        return items;
    }

    @Override
    public Item getItem(Integer id){
        log.info("Get item" + id.toString());

        for (int i = 0; i < items.size(); i++)
        {
            if(items.get(i).getId().equals(id))
                return items.get(i);
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    @Override
    public List getCart(){
        log.info("Get cart");

        return cart;
    }

    @Override
    public void addItem(CreateItemRequest request) {
        Item item = new Item(request.getId(), request.getName(), request.getDescription(), request.getPrice());
        items.add(item);
    }

    @Override
    public void delItem(Integer id) {
        for (int i = 0;i < items.size(); i++) {
            if(items.get(i).getId().equals(id)){
                items.remove(i);
                break;
            }
        }
    }

    @Override
    public void addItemToCart(ItemToCartRequest request){
        for (int i = 0;i < items.size(); i++) {
            if(items.get(i).getId().equals(request.getId())){
                cart.add(items.get(i));
                break;
            }
        }
    }

    public void delItemFromCart(ItemToCartRequest request){
        for (int i = 0;i < cart.size(); i++) {
            if(cart.get(i).getId().equals(request.getId())){
                cart.remove(i);
                break;
            }
        }
    }

}
