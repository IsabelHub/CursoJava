package es.cursojava.inicio.arrays.bidimensionales;

import java.util.Scanner;

/*
 * array dimension de 4x4
 * - pedir todos sus datos
 * - mostrar todos sus datos.
 * - mostrar datos de la diagonal
 * - invertir la diagonal y mostrar el array con la modificacion
 * */


public class BidimensionalesUno {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[][] numeros = new int[2][2]; // 2 filas, 2 columna

		System.out.println("Introduce los datos para el array:");
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.print("Elemento [" + i + "][" + j + "]: ");
				numeros[i][j] = scanner.nextInt();
			}
		}
		
		 System.out.println("----------------");
	     System.out.println("\nMostrar datos:");
		
        for (int[] fila : numeros) {
            for (int numero : fila) {
                System.out.print("\t" + numero + "\t");
            }
            System.out.println();
        }

//        System.out.println("----------------");
//        System.out.println("\nDiagonal:");
//        for (int i = 0; i < numeros.length; i++) {
//            System.out.print(numeros[i][i] + "\t");
//        }
        System.out.println("----------------");
        System.out.println("\nDiagonal:");
    	for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				if(numeros[i]==numeros[j]) {
					 System.out.print(numeros[i][i] + "\t");
				}
			}
			 System.out.println();
    	}
    	 System.out.println("----------------");
    	 int provisional=0;
         System.out.println("\nInvertir:");
         
        
	}

}
