package dev.pronunciationAppBack.service;

import dev.pronunciationAppBack.model.Category;
import dev.pronunciationAppBack.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
   @Autowired
   private CategoryRepository categoryRepository;

    public List<Category> getAllCategoryes(){
        return categoryRepository.findAll();
    }
    public Optional<Category> getCategoryById(String id) {
        return Optional.ofNullable(categoryRepository.findBycategoriId(id));
    }
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }
    public Category updateGCategory(Category UpdateCategory) {
        return categoryRepository.save(UpdateCategory);
    }
    public boolean existsById(String id) {
        return categoryRepository.existsById(id);
    }

    public void deleteCategory(String id) {
       categoryRepository.deleteById(id);
    }


}
