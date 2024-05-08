package Sprint1.Production;
import java.util.Scanner;
import java.lang.*;

public class Question {
    Scanner scanner = new Scanner(System.in);

    public void pregunta1(){
        System.out.println("Pregunta 1: ¿Cuál es la capital de Francia?\n");
        System.out.println("1) Paris");
        System.out.println("2) Berlin");
        System.out.println("3) Lima");
        System.out.println("4) Londres");
        System.out.print("Tu respuesta:");
        int respuesta = 1;

        int resp = scanner.nextInt();
        Verificar(respuesta, resp);
    }

    public int pregunta2(){
        System.out.println("Pregunta 1: ¿Cuál es la capital de Alemania?\n");
        System.out.println("1) Paris");
        System.out.println("2) Berlin");
        System.out.println("3) Lima");
        System.out.println("4) Londres");
        System.out.print("Tu respuesta:");
        int respuesta = 2;

        return respuesta;
    }

    public int pregunta3(){
        System.out.println("Pregunta 1: ¿Cuál es la capital de Inglaterra?\n");
        System.out.println("1) Paris");
        System.out.println("2) Berlin");
        System.out.println("3) Lima");
        System.out.println("4) Londres");
        System.out.print("Tu respuesta:");
        int respuesta = 4;

        return respuesta;
    }

    public int pregunta4(){
        System.out.println("Pregunta 1: ¿Cuál es la capital de Peru?\n");
        System.out.println("1) Paris");
        System.out.println("2) Berlin");
        System.out.println("3) Lima");
        System.out.println("4) Londres");
        System.out.print("Tu respuesta:");
        int respuesta = 3;

        return respuesta;
    }

    public int pregunta5(){
        System.out.println("Pregunta 1: ¿Cuál es la capital de Colombia?\n");
        System.out.println("1) Buenos Aires");
        System.out.println("2) Bogota");
        System.out.println("3) Asunsion");
        System.out.println("4) Madrid");
        System.out.print("Tu respuesta:");
        int respuesta = 2;

        return respuesta;
    }

    public int pregunta6(){
        System.out.println("Pregunta 1: ¿Cuál es la capital de Argentina?\n");
        System.out.println("1) Buenos Aires");
        System.out.println("2) Bogota");
        System.out.println("3) Asunsion");
        System.out.println("4) Madrid");
        System.out.print("Tu respuesta:");
        int respuesta = 1;

        return respuesta;
    }

    public int pregunta7(){
        System.out.println("Pregunta 1: ¿Cuál es la capital de España?\n");
        System.out.println("1) Buenos Aires");
        System.out.println("2) Bogota");
        System.out.println("3) Asunsion");
        System.out.println("4) Madrid");
        System.out.print("Tu respuesta:");
        int respuesta = 4;

        return respuesta;
    }

    public int pregunta8(){
        System.out.println("Pregunta 1: ¿Cuál es la capital de Paraguay?\n");
        System.out.println("1) Buenos Aires");
        System.out.println("2) Bogota");
        System.out.println("3) Asunsion");
        System.out.println("4) Madrid");
        System.out.print("Tu respuesta:");
        int respuesta = 3;

        return respuesta;
    }

    public int pregunta9(){
        System.out.println("Pregunta 1: ¿Cuál es la capital de Venezuela?\n");
        System.out.println("1) Caracas");
        System.out.println("2) Ciudad de Mexico");
        System.out.println("3) Santiago de Chile");
        System.out.println("4) Quito");
        System.out.print("Tu respuesta:");
        int respuesta = 1;

        return respuesta;
    }

    public int pregunta10(){
        System.out.println("Pregunta 1: ¿Cuál es la capital de Ecuador?\n");
        System.out.println("1) Caracas");
        System.out.println("2) Ciudad de Mexico");
        System.out.println("3) Santiago de Chile");
        System.out.println("4) Quito");
        System.out.print("Tu respuesta:");
        int respuesta = 4;

        return respuesta;
    }


    public void Verificar(int respuesta,int resp){
        if(respuesta == resp){
            System.out.println("Correcto!");
        }else{
            System.out.println("Incorrecto!");
        }
    }
}
