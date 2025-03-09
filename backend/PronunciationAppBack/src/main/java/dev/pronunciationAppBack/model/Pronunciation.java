package dev.pronunciationAppBack.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;


@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Pronunciation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String audioDescription;
    private long audioDuration;
    private long audioSize;
    private String audioUrl;
    private String definition;
    private String phoneticSpelling;
    private String speakerGender;

    @Enumerated(EnumType.STRING)
    private type type;

    public enum type {
        RECORDED, SAMPLE
    }


    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "¡Word_id")
    private Word word;



}
