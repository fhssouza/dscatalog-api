package com.souzatech.dscatalogapi.dto;

import com.souzatech.dscatalogapi.entities.Category;

import java.io.Serializable;

/**
 * DTO for {@link com.souzatech.dscatalogapi.entities.Category}
 */
public class CategoryDto implements Serializable {
    private Long id;
    private String name;

    public CategoryDto(){};

    public CategoryDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public CategoryDto(Category entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}