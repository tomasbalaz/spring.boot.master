package sk.balaz.springbootmaster.customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    private CustomerService customerService;

    public CustomerController() {
        this.customerService = new CustomerService();
    }

    @GetMapping
    Customer getCustomer() {
        return customerService.getCustomer();
    }
}
