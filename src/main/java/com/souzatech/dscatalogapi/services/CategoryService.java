package com.souzatech.dscatalogapi.services;

import com.souzatech.dscatalogapi.dto.CategoryDto;
import com.souzatech.dscatalogapi.entities.Category;
import com.souzatech.dscatalogapi.repositories.CategoryRepository;
import com.souzatech.dscatalogapi.services.exceptions.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

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

    public CategoryDto findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        Category entity = obj.orElseThrow(() -> new EntityNotFoundException("Entity not found: " + id));
        return new CategoryDto(entity);
    }
}
