package com.developedbyryan.rivardphotography.category;


import java.util.List;

public interface CategoryService {
    List<Category> list();
    Category read(Integer id);
    void create(Category category);
    void delete(Category category);
    void update(Integer id, Category category);
}
