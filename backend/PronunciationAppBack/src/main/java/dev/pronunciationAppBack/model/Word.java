package dev.pronunciationAppBack.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Word {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String wordName;
    private String definition;
    private String phoneticSpelling;
    private String sentence;
    private boolean isActive;


    @JsonIgnore
    @OneToMany(mappedBy = "word", cascade = CascadeType.ALL)
    private List<Pronunciation> pronunciations;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "caategory_id")
    private Category category;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lavel_id")
    private Lavel lavel;

    @Override
    public String toString() {
        return "Word{" +
                "id='" + id + '\'' +
                ", wordName='" + wordName + '\'' +
                ", definition='" + definition + '\'' +
                ", phoneticSpelling='" + phoneticSpelling + '\'' +
                ", sentence='" + sentence + '\'' +
                ", isActive=" + isActive +
                ", lavel=" + lavel +
                '}';
    }
}
