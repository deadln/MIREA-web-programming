package mirea.web.lab1.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "cart")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartItem {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @Column(name = "user_id")
    private UUID user_id;

    @Column(name = "item_id")
    private UUID item_id;
}
