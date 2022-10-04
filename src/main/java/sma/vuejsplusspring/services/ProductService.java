package sma.vuejsplusspring.services;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sma.vuejsplusspring.entities.Product;
import sma.vuejsplusspring.repositories.ProductRepository;

import java.math.BigDecimal;
import java.util.List;

@Service
@Data
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;

    public List<Product> getProducts(){ return repository.findAll();}

    public void addProduct(String name, BigDecimal price, String picture) {
        repository.save(new Product(0L, name, price, picture));
    }
}
