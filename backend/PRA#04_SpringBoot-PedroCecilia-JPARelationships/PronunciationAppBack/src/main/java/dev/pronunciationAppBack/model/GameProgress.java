package dev.pronunciationAppBack.model;

import jakarta.persistence.*;
import lombok.*;

import jakarta.persistence.Enumerated;

import java.util.Date;
import java.util.List;


@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class GameProgress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private int currentScore;

    public enum Stage {
        STAGE_01, STAGE_02, STAGE_03, STAGE_04, STAGE_05
    }

    @Enumerated(EnumType.STRING)
    private Stage currentStage;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastPlayedDate;

    private int wordsLearned;

    @OneToOne
    @JoinColumn(name = "user_id")
    private AppUser appUser;

    @OneToMany(mappedBy = "gameprogress", cascade = CascadeType.ALL )
    private List<Stage> stage;
}