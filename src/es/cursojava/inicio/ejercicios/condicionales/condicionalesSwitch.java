package es.cursojava.inicio.ejercicios.condicionales;

import java.util.Scanner;

/*
EJERCICIO 4
===============================================
Pintar menu
1. Pintar Cuadrado
2. Validar email
3. Añadir Alumno
4. Salir

Elige una opción

Se pide la opción por teclado, dependiendo de la opción introducida le indicamos la que ha seleccionado, 
si selecciona la 4 le decimos "Adios!" y si no es ninguna de las que existe que se ha equivocado


*/

public class condicionalesSwitch {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);	

		int dia = 3;
		System.out.println("Elige una opción: ");
		System.out.println("1. Pintar Cuadrado " + "2. Validar email" + " 3. Añadir Alumno" + " 4. Salir: ");
		dia= sc.nextInt();
		

		switch (dia) {
		case 1:
			System.out.println("Pintar Cuadrado");
			break;
		case 2:
			System.out.println("Validar email");
			break;
		case 3:
			System.out.println("Añadir Alumno");
			break;

		default:
			System.out.println("Adios");
		}

	}

}
