package guru.springframework.services;

import guru.springframework.domain.Category;

import java.util.List;

public interface CategoryService {

    List<Category> listAllCategorys();

    Category getCategoryById(Integer id);

    Category saveCategory(Category category);

    void deleteCategory(Integer id);
}
