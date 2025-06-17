package programmerzamanow.spring.core.services;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import programmerzamanow.spring.core.repositories.CustomerRepository;

@Component
public class CustomerService {

    @Autowired
    @Getter
    @Qualifier("normalCustomerRepository")
    private CustomerRepository normalCustomerRepository;

    @Autowired
    @Getter
    @Qualifier("premiumCustomerRepository")
    private CustomerRepository premiumCustomerRepository;
}
