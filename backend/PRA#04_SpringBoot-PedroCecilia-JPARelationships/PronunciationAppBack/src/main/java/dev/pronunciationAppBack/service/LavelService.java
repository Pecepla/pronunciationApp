package dev.pronunciationAppBack.service;


import dev.pronunciationAppBack.model.Lavel;

import dev.pronunciationAppBack.model.Stage;
import dev.pronunciationAppBack.model.StageWord;
import dev.pronunciationAppBack.model.Word;
import dev.pronunciationAppBack.repository.LavelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LavelService {

    @Autowired
    private LavelRepository lavelRepository;

    public List<Lavel> getAllLavels() {
        return lavelRepository.findAll();
    }
    public Optional<Lavel> getLavelById(String id) {
        return Optional.ofNullable(lavelRepository.getLavelId(id));

    }
    public Lavel createLavel(Lavel lavel) {
        return lavelRepository.save(lavel);
    }
    public Lavel updateLavel(Lavel lavel) {
        return lavelRepository.save(lavel);
    }
    public void deleteLavel(String id) {
       lavelRepository.deleteById(id);
    }
    public void deleteAlllavels() {
       lavelRepository.deleteAll();
    }

    public long getLavelCount() {
        return lavelRepository.count();
    }
    
}
