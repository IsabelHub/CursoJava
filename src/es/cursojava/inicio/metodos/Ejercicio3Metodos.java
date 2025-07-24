package es.cursojava.inicio.metodos;
/*
 * Ejercicio 3
====================================================================================
Escribe un único método en Java que sirva para realizar los siguientes cálculos 
sobre un rectángulo a partir de la base y la altura proporcionadas por el usuario:

+ Calcular el área del rectángulo. Area=base×altura
+ Calcular el perímetro del rectángulo. Perímetro=2×(base+altura)
+ Calcular la diagonal del rectángulo (utilizando el teorema de Pitágoras). 
Diagonal= (raíz cuadrada)base2+altura2
 
​Devolver todos los datos en un único return

En el main pintar la información devuelta por el método
 * 
 * */
public class Ejercicio3Metodos {
	public static double rectangulo(double base, double altura)
	{
		double resultado=0;
		double area = base * altura;
		double perimetro= 2*area;
		double diagonal =Math.sqrt((Math.pow(area, 2)+Math.pow(base,2)));
		return area+perimetro+diagonal;
	}

}
