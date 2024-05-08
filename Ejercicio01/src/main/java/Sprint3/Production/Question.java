package Sprint3.Production;

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
        cant_preg++;

        int resp = scanner.nextInt();
        if(resp>4 || resp<1){
            System.out.println("Ingrese un numero valido");
            System.out.println("");
            cant_preg--;
            pregunta1();
        }
        Verificar(respuesta, resp);
        System.out.println("");
    }

    public void pregunta2(){
        System.out.println("Pregunta 2: ¿Cuál es la capital de Alemania?");
        System.out.println("1) Paris");
        System.out.println("2) Berlin");
        System.out.println("3) Lima");
        System.out.println("4) Londres");
        System.out.print("Tu respuesta:");
        int respuesta = 2;
        cant_preg++;

        int resp = scanner.nextInt();
        if(resp>4 || resp<1){
            System.out.println("Ingrese un numero valido");
            System.out.println("");
            cant_preg--;
            pregunta2();
        }
        Verificar(respuesta, resp);
        System.out.println("");
    }

    public void pregunta3(){
        System.out.println("Pregunta 3: ¿Cuál es la capital de Inglaterra?");
        System.out.println("1) Paris");
        System.out.println("2) Berlin");
        System.out.println("3) Lima");
        System.out.println("4) Londres");
        System.out.print("Tu respuesta:");
        int respuesta = 4;
        cant_preg++;

        int resp = scanner.nextInt();
        if(resp>4 || resp<1){
            System.out.println("Ingrese un numero valido");
            System.out.println("");
            cant_preg--;
            pregunta3();
        }
        Verificar(respuesta, resp);
        System.out.println("");
    }

    public void pregunta4(){
        System.out.println("Pregunta 4: ¿Cuál es la capital de Peru?");
        System.out.println("1) Paris");
        System.out.println("2) Berlin");
        System.out.println("3) Lima");
        System.out.println("4) Londres");
        System.out.print("Tu respuesta:");
        int respuesta = 3;
        cant_preg++;

        int resp = scanner.nextInt();
        if(resp>4 || resp<1){
            System.out.println("Ingrese un numero valido");
            System.out.println("");
            cant_preg--;
            pregunta4();
        }
        Verificar(respuesta, resp);
        System.out.println("");
    }

    public void pregunta5(){
        System.out.println("Pregunta 5: ¿Cuál es la capital de Colombia?");
        System.out.println("1) Buenos Aires");
        System.out.println("2) Bogota");
        System.out.println("3) Asunsion");
        System.out.println("4) Madrid");
        System.out.print("Tu respuesta:");
        int respuesta = 2;
        cant_preg++;

        int resp = scanner.nextInt();
        if(resp>4 || resp<1){
            System.out.println("Ingrese un numero valido");
            System.out.println("");
            cant_preg--;
            pregunta5();
        }
        Verificar(respuesta, resp);
        System.out.println("");
    }

    public void pregunta6(){
        System.out.println("Pregunta 6: ¿Cuál es la capital de Argentina?");
        System.out.println("1) Buenos Aires");
        System.out.println("2) Bogota");
        System.out.println("3) Asunsion");
        System.out.println("4) Madrid");
        System.out.print("Tu respuesta:");
        int respuesta = 1;
        cant_preg++;

        int resp = scanner.nextInt();
        if(resp>4 || resp<1){
            System.out.println("Ingrese un numero valido");
            System.out.println("");
            cant_preg--;
            pregunta6();
        }
        Verificar(respuesta, resp);
        System.out.println("");
    }

    public void pregunta7(){
        System.out.println("Pregunta 7: ¿Cuál es la capital de España?\n");
        System.out.println("1) Buenos Aires");
        System.out.println("2) Bogota");
        System.out.println("3) Asunsion");
        System.out.println("4) Madrid");
        System.out.print("Tu respuesta:");
        int respuesta = 4;
        cant_preg++;

        int resp = scanner.nextInt();
        if(resp>4 || resp<1){
            System.out.println("Ingrese un numero valido");
            System.out.println("");
            cant_preg--;
            pregunta7();
        }
        Verificar(respuesta, resp);
        System.out.println("");
    }

    public void pregunta8(){
        System.out.println("Pregunta 8: ¿Cuál es la capital de Paraguay?\n");
        System.out.println("1) Buenos Aires");
        System.out.println("2) Bogota");
        System.out.println("3) Asunsion");
        System.out.println("4) Madrid");
        System.out.print("Tu respuesta:");
        int respuesta = 3;
        cant_preg++;

        int resp = scanner.nextInt();
        if(resp>4 || resp<1){
            System.out.println("Ingrese un numero valido");
            System.out.println("");
            cant_preg--;
            pregunta8();
        }
        Verificar(respuesta, resp);
        System.out.println("");
    }

    public void pregunta9(){
        System.out.println("Pregunta 9: ¿Cuál es la capital de Venezuela?\n");
        System.out.println("1) Caracas");
        System.out.println("2) Ciudad de Mexico");
        System.out.println("3) Santiago de Chile");
        System.out.println("4) Quito");
        System.out.print("Tu respuesta:");
        int respuesta = 1;
        cant_preg++;

        int resp = scanner.nextInt();
        if(resp>4 || resp<1){
            System.out.println("Ingrese un numero valido");
            System.out.println("");
            cant_preg--;
            pregunta9();
        }
        Verificar(respuesta, resp);
        System.out.println("");
    }

    public void pregunta10(){
        System.out.println("Pregunta 10: ¿Cuál es la capital de Ecuador?\n");
        System.out.println("1) Caracas");
        System.out.println("2) Ciudad de Mexico");
        System.out.println("3) Santiago de Chile");
        System.out.println("4) Quito");
        System.out.print("Tu respuesta:");
        int respuesta = 4;
        cant_preg++;

        int resp = scanner.nextInt();
        if(resp>4 || resp<1){
            System.out.println("Ingrese un numero valido");
            System.out.println("");
            cant_preg--;
            pregunta10();
        }
        Verificar(respuesta, resp);
        System.out.println("");
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
        System.out.println("Preguntas contestadas: " + cant_preg);
        System.out.println("Respuestas correctas: " + cont);
        int incorrectas = cant_preg-cont;
        System.out.println("Respuestas incorrectas: " + incorrectas);
    }
}
