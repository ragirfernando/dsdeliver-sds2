package com.devsuperior.dsdeliver.contollers;

import com.devsuperior.dsdeliver.dto.ProductDto;
import com.devsuperior.dsdeliver.services.ProductService;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping
    public ResponseEntity<List<ProductDto>> findAll(){
        List<ProductDto> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
}
