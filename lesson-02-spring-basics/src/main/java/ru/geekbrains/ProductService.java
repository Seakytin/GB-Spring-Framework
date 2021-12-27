package ru.geekbrains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.geekbrains.persist.Product;
import ru.geekbrains.persist.ProductRepository;

import javax.annotation.PostConstruct;

@Component

public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @PostConstruct
    public void init(){
        productRepository.save(new Product(null, "Product1"));
        productRepository.save(new Product(null, "Product2"));
        productRepository.save(new Product(null, "Product3"));

    }

    public long count() {
        return productRepository.findAll().size();
    }
}
