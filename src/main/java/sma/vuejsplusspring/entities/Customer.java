package sma.vuejsplusspring.entities;

import javax.persistence.Id;

public class Customer {
    @Id
    Long id;
    Cart cart;
    Order order;
}
