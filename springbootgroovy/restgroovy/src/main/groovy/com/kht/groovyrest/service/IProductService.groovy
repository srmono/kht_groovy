package com.kht.groovyrest.service

import com.kht.groovyrest.entity.Product

interface IProductService {
	List<Product> findAll()
	
	Product findById(Long productId)
	
	Product saveProduct(Product product)
	
	Product updateProduct(Long productId, Product product)
	
	Product deleteProduct(Long productId)
	
}
