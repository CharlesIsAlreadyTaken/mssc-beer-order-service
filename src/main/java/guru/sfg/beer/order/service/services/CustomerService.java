package guru.sfg.beer.order.service.services;

import guru.sfg.brewery.model.CustomerDto;

import java.util.List;

public interface CustomerService {
    List<CustomerDto> getCustomers();
}
