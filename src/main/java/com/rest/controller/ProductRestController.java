package com.rest.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.binding.Product;

@RestController
public class ProductRestController {
	@GetMapping("/product")
	public ResponseEntity<Product> getProductdetails(){
		Product p=new Product();
		p.setPid(101);
		p.setPname("Mouse");
		p.setPrice(450.00);
		return new ResponseEntity<>(p,HttpStatus.OK);
	}
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getProducts(){
		Product p1=new Product(101,"Monitor",3200.00);
		Product p2=new Product(102,"RAM",5200.00);
		
		Product p3=new Product(103,"CPU",13200.00);
		List<Product> list=Arrays.asList(p1,p2,p3);
		return new ResponseEntity<>(list,HttpStatus.OK);
		
	}
}
