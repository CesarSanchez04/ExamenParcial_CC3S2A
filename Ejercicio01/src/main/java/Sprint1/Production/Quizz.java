package Sprint1.Production;

import java.util.Scanner;
import java.lang.*;

public class Quizz {

    Scanner scanner = new Scanner(System.in);
    Question question = new Question();

    public void Start(){
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Bienvenido al juego de Trivia!");
        System.out.println("");
        System.out.println("Responde las siguientes preguntas seleccionando el numero de la opcion correcta");
        System.out.println("Se sumara un punto por cada respuesta correcta, no hay puntos en contra");
        System.out.println("--------------------------------------------------------------------------------------------");
    }

    public void CargarPreguntas(){
        question.pregunta1();
//        question.pregunta2();
//        question.pregunta3();
//        question.pregunta4();
//        question.pregunta5();
//        question.pregunta6();
//        question.pregunta7();
//        question.pregunta8();
//        question.pregunta9();
//        question.pregunta10();


    }

    public void End(){
        System.out.println("Juego terminado. Aqui esta su puntuacion");
        System.out.println();
    }
}
