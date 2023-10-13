package com.anuv.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.anuv.CustomerManagement.*;
@RestController

public class CustController {
    @GetMapping("/welc")
    String welcoming()
    {
       return "Hello everyone ";
    }

}
