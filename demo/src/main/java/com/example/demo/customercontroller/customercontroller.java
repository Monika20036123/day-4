package com.example.demo.customercontroller;


import com.example.demo.DTO.customerDTO;
import com.example.demo.customerservice.customerservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("api/v1/customer")
public class customercontroller {


    @Autowired
   private customerservice customerservice;



    @PostMapping(path="/save")
    public String  savecustomer(@RequestBody customerDTO customerDTO)
    {
        String id  = customerservice.addcustomer(customerDTO);
        return id
    }


}
