/*Programa que, dada una frase de no más de 80 caracteres, busque cuántas mayúsculas y cuantas minúsculas tiene y lo imrpima.
 * 
 * 
 */
package Tema_04;

import java.util.Scanner;

public class Problema_02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int contMay = 0;
		int contMin = 0;
		String cadena;
		String mayusculas = "";
		
		System.out.println("Escribe");
		cadena = teclado.nextLine();
		mayusculas = cadena.toUpperCase();
		System.out.println(cadena);
		System.out.println(mayusculas);
		
		for (int i= 0; i < cadena.length(); i++) {
			
			if(cadena.charAt(i) == mayusculas.charAt(i))
				//TENGO QUE MIRAR PRIMERO SI ES LETRA O NO
				contMay++;
			else
				contMin++;	
		}//for
		
		System.out.println("Mayusculas = " + contMay);
		System.out.println("Minusculas = " + contMin);

	}//main

}//class
