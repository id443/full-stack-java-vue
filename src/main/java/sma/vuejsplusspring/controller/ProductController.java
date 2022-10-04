package sma.vuejsplusspring.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import sma.vuejsplusspring.entities.Product;
import sma.vuejsplusspring.services.ProductService;

import java.math.BigDecimal;
import java.util.List;

@RestController
@AllArgsConstructor
public class ProductController {
    private final ProductService service;

    @GetMapping("/api/products")
    public List<Product> getProducts() {
        return service.getProducts();
    }

    @PostMapping("/api/")
    public void addProduct(String name, BigDecimal price, String picture) {
        service.addProduct(name, price, picture);
    }
}
