/*
 * Programa que lee un número e imprime sus divisores propios, para ello comprueba
 * todos los números comprendidos entre 2 y el número menos uno para determinar
 * cuáles dividen a dicho número
*/
package actividades_programacion;

import java.util.Scanner;

public class Problema3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num;
		int resto;
		
		System.out.println("Introduzca un número para saber sus divisores propios");
		num = teclado.nextInt();
		
		if(num <= 3)
			
			System.out.println("El numero " + num + " no tiene divisores propios");
		
		for (int i=2; i < num / 2; i++) { //for
			resto = num % i;
			if (resto == 0) {
				System.out.println("El número es divisible por: " + i);

				System.out.println("El número es divisible por: " + (-1 * i));
			}//if
		}//for

	}//main

}//Problema3
