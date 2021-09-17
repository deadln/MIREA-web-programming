package mirea.web.lab1.config;

import mirea.web.lab1.dto.Item;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class DefaultItemsConfig {
    @Bean
    public List<Item> defaultItems() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(1, "GTA 6", "New GTA", 60.0));
        items.add(new Item(2, "STALKER 2", "Davno ya Strelka ne videl...", 45.0));
        items.add(new Item(3, "Half-Life 3", "After 15 years in development hopefully it was worth the wait", 100.0));

        return items;
    }
}
