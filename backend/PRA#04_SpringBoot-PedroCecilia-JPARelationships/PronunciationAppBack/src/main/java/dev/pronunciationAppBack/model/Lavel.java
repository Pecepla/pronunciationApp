package dev.pronunciationAppBack.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Lavel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private int number;
    private String name;
    private int requiredScore;
    private Boolean isBloked;

    @OneToMany(mappedBy = "level", cascade = CascadeType.ALL)
    private List<Word> words;
    @OneToMany(mappedBy = "lavel", cascade = CascadeType.ALL)
    private List<Stage> stages;
}
