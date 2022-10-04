package sma.vuejsplusspring.entities;

import lombok.Data;
import java.util.List;

@Data
public class Cart {
    Integer id;
    List<Product> products;
}
