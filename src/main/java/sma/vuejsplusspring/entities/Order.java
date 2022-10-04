package sma.vuejsplusspring.entities;

import javax.persistence.Id;
import java.util.List;

public class Order {
    @Id
    Long id;
    Status status;
    List<Product> productList;
}
