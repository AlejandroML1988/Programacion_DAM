/*Escribe un programa que pida por teclado una cadena y una letra, de manera que elimine las 3
 * primeras ocurrencias de la letra que encuentre en la cadena y lo muestre por pantalla.
 *  
 */

package Tema_04;

import java.util.Scanner;

public class Problema_Parte2_02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String frase;
		String fraseFinal="";
		char letra;
		int cont = 0;
		
		System.out.println("Escribe una frase");
		frase = teclado.nextLine();
		System.out.println("Frase introducida");
		System.out.println(frase);
		frase = frase.toUpperCase();
		System.out.println("Escribe una letra para buscarla en la frase");
		letra = (teclado.nextLine()).charAt(0);
		letra = Character.toUpperCase(letra);
		System.out.println("Letra = " + letra);
		
		while (cont < 4) {
		for (int i = 0; i < frase.length(); i++) {
			
			
				
				if (frase.charAt(i) != letra) //comparo la letra. si no es igual, la concateno
					fraseFinal += frase.charAt(i);
				
				else
					cont++;
			}//while
		}
		System.out.println(fraseFinal);

	}//main

}//class
