package ru.geekbrains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.geekbrains.persist.CartService;
import ru.geekbrains.persist.Product;
import ru.geekbrains.persist.ProductRepository;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        Product product1 = new Product(1L, "product1");
        Product product2 = new Product(2L, "product2");
        Product product3 = new Product(3L, "product3");
        Product product4 = new Product(4L, "product4");
        Product product5 = new Product(5L, "product5");


        ProductRepository productRepository = context.getBean("productRepository", ProductRepository.class);

        productRepository.save(product1);
        productRepository.save(product2);
        productRepository.save(product3);
        productRepository.save(product4);
        productRepository.save(product5);

        CartService cartService = context.getBean("cartService", CartService.class);
        cartService.addProduct(product1.getId());
        System.out.println(cartService.getProductList());
        cartService.deleteProduct(product1.getId());
        System.out.println(cartService.getProductList());


        cartService.addProduct(product1.getId());

        cartService = context.getBean("cartService", CartService.class);
        System.out.println(cartService.getProductList());

    }
}
