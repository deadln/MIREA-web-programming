package mirea.web.lab1.repository;

import mirea.web.lab1.entity.CartItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CartRepository extends CrudRepository<CartItem, UUID> {
}
