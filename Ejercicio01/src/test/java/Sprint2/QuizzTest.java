package Sprint2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.*;

public class QuizzTest {
    private Question question = new Question();
    private Quizz quizz;

    @BeforeEach
    void setUp(){
        quizz = new Quizz();
    }

    @Test
    void CargarPreguntas_Test(){
        question.pregunta1();
        assert
    }
}
