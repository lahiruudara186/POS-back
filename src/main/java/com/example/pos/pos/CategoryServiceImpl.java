package com.example.pos.pos;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService{
    
    private final CategoryRepository categoryRepository;

    public Category createCategory(CategoryDta categoryDta){
        Category category = new Category();
        category.setName(categoryDta.getName());
        category.setDescription(categoryDta.getDescription());

        return categoryRepository.save(category);
    }
}
