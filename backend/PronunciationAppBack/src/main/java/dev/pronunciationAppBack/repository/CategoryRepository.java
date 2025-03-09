package dev.pronunciationAppBack.repository;

import dev.pronunciationAppBack.model.Category;
import dev.pronunciationAppBack.model.GameProgress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, String> {

    Category findBycategoriId(String categoryId);

}
