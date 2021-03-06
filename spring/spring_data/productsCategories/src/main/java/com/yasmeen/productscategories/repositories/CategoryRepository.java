package com.yasmeen.productscategories.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yasmeen.productscategories.models.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long>{

	
}
