package dev.pronunciationAppBack.repository;

import dev.pronunciationAppBack.model.Pronunciation;
import dev.pronunciationAppBack.model.Stage;


import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface StageRepository extends JpaRepository<Stage, String> {

    List<Stage> getStageById(String stageId);

}
