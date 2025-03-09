package dev.pronunciationAppBack.service;


import dev.pronunciationAppBack.model.Stage;
import dev.pronunciationAppBack.repository.StageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StageService {

    @Autowired
    private StageRepository stageRepository;

    public List<Stage> getAllStages() {
        return stageRepository.findAll();
    }

    public List<Stage> getStageById(String id) {
        return stageRepository.getStageById(id);
    }

    public Stage createStage(Stage stages) {
        return stageRepository.save(stages);
    }
    public Stage updateStage(Stage stages) {
        return stageRepository.save(stages);
    }
    public void deleteStage(String id) {
        stageRepository.deleteById(id);
    }

    public void deleteAllStages() {
        stageRepository.deleteAll();
    }
    public boolean existsById(String id) {
        return  stageRepository.existsById(id);
    }

    public long getStageCount() {
        return stageRepository.count();
    }
}
