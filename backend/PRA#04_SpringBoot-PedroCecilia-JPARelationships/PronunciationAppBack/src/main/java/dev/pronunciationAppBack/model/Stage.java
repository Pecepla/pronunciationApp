package dev.pronunciationAppBack.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.logging.Level;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Stage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String name;
    private String avatarUrl;
    private String status;
    private int progress;
    private int currentScore;

    @ManyToOne
    @JoinColumn(name = "level_id")
    private Level level;

    @OneToMany(mappedBy = "stage", cascade = CascadeType.ALL)
    private List<StageWord> stageWords;

    @ManyToOne
    @JoinColumn(name = "game_progress_id")
    private GameProgress gameProgress;

}