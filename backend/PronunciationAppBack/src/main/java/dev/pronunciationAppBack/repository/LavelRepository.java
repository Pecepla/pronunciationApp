package dev.pronunciationAppBack.repository;

import dev.pronunciationAppBack.model.Lavel;
import dev.pronunciationAppBack.model.Stage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LavelRepository extends JpaRepository<Lavel, String> {

    Lavel  getLavelId(String id);

}
