package mirea.web.lab1.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Item extends RepresentationModel<Item> {
    private Integer id;
    private String name;
    private String description;
    private Double price;

}
