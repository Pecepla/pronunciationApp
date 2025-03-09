package dev.pronunciationAppBack.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GameProgress {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
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


}