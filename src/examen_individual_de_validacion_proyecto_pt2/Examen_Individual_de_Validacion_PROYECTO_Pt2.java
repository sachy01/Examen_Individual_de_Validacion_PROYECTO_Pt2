/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_individual_de_validacion_proyecto_pt2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author juanc
 */
public class Examen_Individual_de_Validacion_PROYECTO_Pt2 {

    public static void main(String[] args) throws InterruptedException {
     
        
        /*
        int[] adivina = new int[10];
        int[] aciertos = new int[10];
        int[] part = new int[2];*/
        // Pausa(2);
      //  RaAdivina(adivina);
        //   Pausa(2);
        System.out.println("");

   //     TirarDados(part);

     //   ganador4(aciertos, adivina, part);

    }

    private static void Pausa(int a) throws InterruptedException {
        /*Esta funcion crea pausas en el programa para simular las pausas televisivas
     de un concurso. Le otorgaremos a la función un valor a, el cual definirá 
     el número de segundos de pausa.*/
        Thread.sleep(a * 1000);
    }

    private static float Aleatorio(int limInf, int limSup) {
        Random rand = new Random();
        double aleatorio = limInf + rand.nextInt(limSup - limInf);
        return (float) aleatorio;

    }
/*
    private static void RaAdivina(int[] adivina) {
        Random rd = new Random();
        for (int i = 0; i < adivina.length; i++) {
            adivina[i] = (int) Aleatorio(1, 6);
            System.out.print(adivina[i] + " ,");
        }
    }

    private static void TirarDados(int[] part) {
        Random rd = new Random();
        for (int i = 0; i < part.length; i++) {
            part[i] = (int) Aleatorio(1, 6);
        }
    }

    private static void ganador4(int[] aciertos, int[] adivina, int[] part) {
        int num = 0, cont = 0;
        for (int i = 0; i < aciertos.length; i++) {
            if (part[0] == adivina[0]) {
                num++;
                aciertos[0] = 1;
            } else if (part[1] == adivina[0]) {
                cont++;
                aciertos[0] = 2;
            }
            TirarDados(part);
            if (part[0] == adivina[1]) {
                num++;
                aciertos[1] = 1;
            } else if (part[1] == adivina[1]) {
                cont++;
                aciertos[1] = 2;
            }
            TirarDados(part);
            if (part[0] == adivina[2]) {
                num++;
                aciertos[2] = 1;
            } else if (part[1] == adivina[2]) {
                cont++;
                aciertos[2] = 2;
            }
            TirarDados(part);
            if (part[0] == adivina[3]) {
                num++;
                aciertos[3] = 1;
            } else if (part[1] == adivina[3]) {
                cont++;
                aciertos[3] = 2;
            }
            TirarDados(part);
            if (part[0] == adivina[4]) {
                num++;
                aciertos[4] = 1;
            } else if (part[1] == adivina[4]) {
                cont++;
                aciertos[4] = 2;
            }
            TirarDados(part);
            if (part[0] == adivina[5]) {
                num++;
                aciertos[5] = 1;
            } else if (part[1] == adivina[5]) {
                cont++;
                aciertos[5] = 2;
            }
            TirarDados(part);
            if (part[0] == adivina[6]) {
                num++;
                aciertos[6] = 1;
            } else if (part[1] == adivina[6]) {
                cont++;
                aciertos[6] = 2;
            }
            TirarDados(part);
            if (part[0] == adivina[7]) {
                num++;
                aciertos[7] = 1;
            } else if (part[1] == adivina[7]) {
                cont++;
                aciertos[7] = 2;
            }
            TirarDados(part);
            if (part[0] == adivina[8]) {
                num++;
                aciertos[8] = 1;
            } else if (part[1] == adivina[8]) {
                cont++;
                aciertos[8] = 2;
            }
            TirarDados(part);
            if (part[0] == adivina[9]) {
                num++;
                aciertos[9] = 1;
            } else if (part[1] == adivina[9]) {
                cont++;
                aciertos[9] = 2;
            }
        }
        System.out.println("");
        for (int i = 0; i < aciertos.length; i++) {

            System.out.print(aciertos[i] + " ,");
        }
        System.out.println("");
        if (num < cont) {
            System.out.println("los asiertos del partisipante 2 son " + cont);
            System.out.println("Felicidades jugador 2");
            gracias();
        } else {
            System.out.println("los puntos del partisipante 1 son " + num);
            System.out.println("Felicidades jugador 1");
            gracias();
        }

    }

    private static void gracias() {
        System.out.println("Te has ganado un curso de verano ");
        System.out.println("en la Universidad de Informática ñpasarla bien");
    }
*/
}
