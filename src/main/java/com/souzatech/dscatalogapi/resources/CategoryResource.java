package com.souzatech.dscatalogapi.resources;

import com.souzatech.dscatalogapi.dto.CategoryDto;
import com.souzatech.dscatalogapi.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @Autowired
    CategoryService service;
    @GetMapping
    public ResponseEntity<List<CategoryDto>> findAll(){
        List<CategoryDto> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

}
