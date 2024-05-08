package Sprint2.Production;

import java.util.Scanner;

public class Question {
    Scanner scanner = new Scanner(System.in);
    int cont = 0;
    int cant_preg = 0;

    public void pregunta1(){
        System.out.println("Pregunta 1: ¿Cuál es la capital de Francia?");
        System.out.println("1) Paris");
        System.out.println("2) Berlin");
        System.out.println("3) Lima");
        System.out.println("4) Londres");
        System.out.print("Tu respuesta:");
        int respuesta = 1;

        int resp = scanner.nextInt();
        Verificar(respuesta, resp);
        System.out.println("");
    }

    public void pregunta2(){
        System.out.println("Pregunta 1: ¿Cuál es la capital de Alemania?");
        System.out.println("1) Paris");
        System.out.println("2) Berlin");
        System.out.println("3) Lima");
        System.out.println("4) Londres");
        System.out.print("Tu respuesta:");
        int respuesta = 2;

        int resp = scanner.nextInt();
        Verificar(respuesta, resp);
        System.out.println("");
    }

    public void pregunta3(){
        System.out.println("Pregunta 1: ¿Cuál es la capital de Inglaterra?");
        System.out.println("1) Paris");
        System.out.println("2) Berlin");
        System.out.println("3) Lima");
        System.out.println("4) Londres");
        System.out.print("Tu respuesta:");
        int respuesta = 4;

        int resp = scanner.nextInt();
        Verificar(respuesta, resp);
        System.out.println("");
    }

    public int pregunta4(){
        System.out.println("Pregunta 1: ¿Cuál es la capital de Peru?");
        System.out.println("1) Paris");
        System.out.println("2) Berlin");
        System.out.println("3) Lima");
        System.out.println("4) Londres");
        System.out.print("Tu respuesta:");
        int respuesta = 3;

        return respuesta;
    }

    public int pregunta5(){
        System.out.println("Pregunta 1: ¿Cuál es la capital de Colombia?");
        System.out.println("1) Buenos Aires");
        System.out.println("2) Bogota");
        System.out.println("3) Asunsion");
        System.out.println("4) Madrid");
        System.out.print("Tu respuesta:");
        int respuesta = 2;

        return respuesta;
    }

    public int pregunta6(){
        System.out.println("Pregunta 1: ¿Cuál es la capital de Argentina?");
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
            cont ++;
        }else{
            System.out.println("Incorrecto!");
        }
    }

    public void Puntuacion(){
        System.out.println("Puntuacion: " + cont);
    }
}
