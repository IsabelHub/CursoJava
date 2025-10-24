package es.cursojava.ejerciciospreparacionexamen;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio80 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		TreeSet<Integer> tsnumeros = new TreeSet<>();

		System.out.println("Introduce numeros separadas por un espacio:");
		for (String almacenNum : sc.nextLine().split(" ")) {
			try {
				if (!tsnumeros.add(Integer.parseInt(almacenNum))) {
					System.out.println("Ya has introducido antes este numero: " + almacenNum);
				}
			} catch (NumberFormatException e) {

			}

		}
		// ----muestramelos:
		System.out.println("Los números introducidos son ");
		Iterator<Integer> iterator = tsnumeros.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next());
			System.out.print("\t");

		}

		sc.close();
	}

}
