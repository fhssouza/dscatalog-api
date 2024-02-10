package com.souzatech.dscatalogapi.services;

import com.souzatech.dscatalogapi.dto.CategoryDto;
import com.souzatech.dscatalogapi.entities.Category;
import com.souzatech.dscatalogapi.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    @Transactional(readOnly = true)
    public List<CategoryDto> findAll(){
        List<Category> list = repository.findAll();
        return list.stream()
                .map(CategoryDto::new)
                .toList();
    }
}
