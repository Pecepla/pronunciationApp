/*package dev.pronunciationAppBack;

import dev.pronunciationAppBack.model.Stage;
import dev.pronunciationAppBack.repository.StageRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;
@SpringBootTest
public class StageTest {




    @Autowired
    StageRepository stageRpository;



    @Test
    public void AssignTestStage() {

        //Word w1 = new Word();

        Stage st = new Stage();
        st.setId("1");
        st.setName("Test");
        st.setAvatarUrl("test");
        st.setStatus("test");
        st.setProgress(1);
        st.setProgress(3);
        st.setCurrentScore(100);

        stageRpository.save(st);


    }
    }*/