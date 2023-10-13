package com.anuv.CustomerManagement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController

public class CustomersController {

    ArrayList<Customer> customerArrayList = new ArrayList<>();

    @GetMapping("/welcome")
    String welcoming() {
        return "Welcome to our login page";
    }

	@PostMapping("/adding")
	void adding(String firstName, String lastName, String phoneNumber, String residentCode, String email, String password)
	{
        Customer c = new Customer(firstName, lastName, phoneNumber,residentCode,email,password);
        customerArrayList.add(c);

	}

    @GetMapping("/list")
    ArrayList listOfCustomers()
    {
        return customerArrayList;
    }

    @RequestMapping(value = "/index")
    public String index() {
        return "templates/index.html";
    }

    @GetMapping("/")
    String content()
    {
        return "index";
    }
}
