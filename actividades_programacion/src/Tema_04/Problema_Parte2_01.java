/*Escribir un programa que pida por teclado una cadena y una letra, de manera que ponga en
 * mayúsculas cada ocurrencia de la letra que haya en la cadena y lo muestre por pantalla.
 * 
 * Solución: HAY QUE USAR REPLACE
 */

package Tema_04;

import java.util.Scanner;

public class Problema_Parte2_01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String frase;
		String caracter;
		String imprimir;
		
		System.out.println("Escribe una frase");
		frase = teclado.nextLine();
		System.out.println("Escribe una letra para buscarla en la frase y convertirla en mayusculas");
		caracter = teclado.nextLine();
		
		imprimir = frase.replace(caracter, caracter.toUpperCase());
		System.out.println(imprimir);
		
				
		
	}//main

}//class
