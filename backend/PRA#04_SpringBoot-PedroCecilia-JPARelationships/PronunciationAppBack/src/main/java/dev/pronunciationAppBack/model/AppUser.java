package dev.pronunciationAppBack.model;

import jakarta.persistence.*;
import lombok.*;



@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String userName;
    private int age;
    private String email;
    private String password;
    private int totalScore;
    private boolean isActive;

    @OneToOne(mappedBy = "user_id", cascade = CascadeType.ALL)
    private GameProgress gameProgress;
}


