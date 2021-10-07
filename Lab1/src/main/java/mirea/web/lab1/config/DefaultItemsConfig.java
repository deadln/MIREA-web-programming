package mirea.web.lab1.config;

import mirea.web.lab1.dto.ItemDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Configuration
public class DefaultItemsConfig {
    @Bean
    public List<ItemDto> defaultItems() {
        List<ItemDto> items = new ArrayList<>();
        //items.add(new ItemDto(UUID.randomUUID(), "GTA 6", "New GTA", 60.0));
        //items.add(new ItemDto(UUID.randomUUID(), "STALKER 2", "Davno ya Strelka ne videl...", 45.0));
        //items.add(new ItemDto(UUID.randomUUID(), "Half-Life 3", "After 15 years in development hopefully it was worth the wait", 100.0));

        return items;
    }
}
