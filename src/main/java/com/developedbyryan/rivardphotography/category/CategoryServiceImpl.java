package com.developedbyryan.rivardphotography.category;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryService categoryService;


    @Override
    public List<Category> list() {
        return categoryService.list();
    }

    @Override
    public Category read(Integer id) {
        return categoryService.read(id);
    }

    @Override
    public void create(Category category) {
        categoryService.create(category);
    }

    @Override
    public void delete(Category category) {
        categoryService.delete(category);
    }

    @Override
    public void update(Integer id, Category category) {
        categoryService.update(id, category);
    }
}
