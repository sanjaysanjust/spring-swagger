package com.example.mysql.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	private static List<String> prodList = new ArrayList<>();
	static {
		prodList.add("Aplle");
		prodList.add("Pineapple");

	}

	@GetMapping("/products")
	public ResponseEntity<List<String>> getProdcuts() {

		return ResponseEntity.ok().body(prodList);
	}

	@PostMapping("/products")
	public ResponseEntity<String> addProduct(String prod) {
		prodList.add(prod);
		String str = "Product" + prod + "Has Been Added";
		return ResponseEntity.ok().body(str);
	}

}
