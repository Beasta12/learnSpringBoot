package programmerzamanow.spring.core.services;

import lombok.Getter;
import org.springframework.stereotype.Component;
import programmerzamanow.spring.core.repositories.ProductRepository;

@Component
public class ProductService {

    @Getter
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}
