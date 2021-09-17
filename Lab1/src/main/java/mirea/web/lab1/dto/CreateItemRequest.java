package mirea.web.lab1.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateItemRequest {
    private Integer id;
    private String name;
    private String description;
    private Double price;

}