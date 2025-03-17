package com.example.swts.Controller;

import com.example.swts.Model.ServicesModel;
import com.example.swts.Repository.ServicesRepository;
import com.example.swts.Service.ServicesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins ="*", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class ServicesController {

  @Autowired
  ServicesRepository repository;

  @GetMapping("/GetCard")
  public List<ServicesModel> getProducts(){
    return repository.findAll();
  }

}
