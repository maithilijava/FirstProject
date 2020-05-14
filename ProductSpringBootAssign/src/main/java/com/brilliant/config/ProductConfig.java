package com.brilliant.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import com.brilliant.service.ProductService;

@Configuration
public class ProductConfig {
	
	//@Bean
    public ProductService productService() {
        return new ProductService();
    }

}
