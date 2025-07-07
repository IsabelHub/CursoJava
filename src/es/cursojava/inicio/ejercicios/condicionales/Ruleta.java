/*
 * ============================
          Ruleta:
============================

Facil:
saldo = 500

¿Por qué numero quieres apostar? (0-36) 
Si es otro numero numero se vuelve a formular la pregunta

¿Cuánto dinero quieres apostar? 
Si el importe de la apuesta es > que el saldo disponible por el usuario,
se notifica y se vuelve a formular la pregunta

De manera aleatoria generar un nº entre 0 y 36

Si el numero apostado es = al nº aleatorio, se multiplica lo apostado *36 y se suma al saldo no apostado
Si no lo es le restamos del saldo la cantidad apostada

Si tiene saldo le perguntamos ¿Quieres seguir jugando? si dice que no le indicamos el saldo con el que se va y si no tiene saldo le indicamos que se ha quedado sin dinero.

Dificil
============================
Preguntar a qué juego quiere jugar (Número,Par/Impar,Bloques)

+ Si la apuesta es par/impar y se gana, se multiplica lo apostado *2
+ Si la apuesta es Bloques y se gana, se multiplica lo apostado *5 (1-12,13-24,25-36)
 * */
package es.cursojava.inicio.ejercicios.condicionales;

import java.util.Random;
import java.util.Scanner;

public class Ruleta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int saldo = 500;
        int opcion;

        do {
            System.out.println("\n------ Elige una opción ------");
            System.out.println("1. Jugar una ronda");
            System.out.println("2. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            int apuesta;
            int numero;
            boolean numeroCorrecto=true;
            boolean apuestaIncorrecta=false;


            switch (opcion) {
                case 1:
                    do {
                        System.out.print("¿Por qué número quieres apostar? (0-36): ");
                        numero = sc.nextInt();
                        numeroCorrecto = (numero > 0 && numero <= 36);

                        if (!numeroCorrecto) {
                            System.out.println("Número inválido. Debe estar entre 0 y 36.");
                        }
                    } while (!numeroCorrecto);

                    //esta opcion es menos eficiente:                
//                     do {
//                        System.out.print("¿Por qué número quieres apostar? (0-36): ");
//                        numero = sc.nextInt();
//                        if (numero < 0 || numero > 36) {
//                            System.out.println("Número inválido. Debe estar entre 0 y 36.");
//                        }
//                    	} while (numero < 0 || numero > 36);
               
                  
                    do {
                        System.out.print("¿Cuánto dinero quieres apostar? (Saldo: " + saldo + "): ");
                        apuesta = sc.nextInt();
                        if (apuesta > saldo || apuesta <= 0) {
                            System.out.println("Apuesta inválida. No puedes apostar más de tu saldo ni un valor negativo.");
                            apuestaIncorrecta=false;
                        }
                    } while (apuestaIncorrecta);

                    int numeroGanador = random.nextInt(37); // 0 a 36
                    System.out.println("El número ganador es: " + numeroGanador);

                    if (numero == numeroGanador) {
                        int ganancia = apuesta * 36;
                        saldo += ganancia;
                        System.out.println("¡Ganaste! Tu ganancia es: " + ganancia);
                    } else {
                        saldo -= apuesta;
                        System.out.println("Perdiste. Saldo actual: " + saldo);
                    }

                    if (saldo <= 0) {
                        System.out.println("Te has quedado sin saldo. Fin del juego.");
                        opcion = 2; // 
                    }
                    break;

                case 2:
                    System.out.println("Saliendo del juego. Saldo final: " + saldo);
                    break;

                default:
                    System.out.println("Opción incorrecta, intenta de nuevo.");
            }

        } while (opcion != 2);

        sc.close();
    }
}