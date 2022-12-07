package com.supplychainmanagement.inventory.controller;

import com.supplychainmanagement.inventory.entity.Order;
import com.supplychainmanagement.inventory.entity.Product;
import com.supplychainmanagement.inventory.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventory")
public class ProductController {

    @Autowired
    private ProductService productService;


    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @GetMapping("/findall")
    public List<Product> listAllProducts(){
        return productService.listAllProducts();
    }

    @GetMapping("/findbyname/{id}")
    public Product getProductByName(@PathVariable("id") String productName){
        return productService.getProductByName(productName);
    }

    @PutMapping("/update/{id}")
    public Product updateProductByName(@PathVariable("id") String productName,@RequestBody Product productData){
        return productService.updateProductByName(productName,productData);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> deleteProductByName(@PathVariable("id") String productName){
        return productService.deleteProductByName(productName);
    }

    @GetMapping("/getallorders")
    public List<Order> getAllOrders(){
        return productService.getAllOrders();
    }

    @GetMapping("/acceptrejectorder/{id}")
    public Order acceptRejectOrder(@PathVariable("id") String orderNumber){
        return productService.acceptRejectOrder(orderNumber);
    }


}
