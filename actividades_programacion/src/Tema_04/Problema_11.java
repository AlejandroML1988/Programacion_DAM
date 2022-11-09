/*Escribir un programa que lea una frase (máximo 60 caracteres) y diga cuántas letras distintas
 * tiene y la frecuencia de las mismas, para homogeneizar el conjunto de letras debemos trabajar
 * solo con mayúsculas. ¿¿¿ Indica cuáles son los ficheros de entrada y salida del compilador. ???
 * 
 */
//Archivo entrada compilador: D:\eclipse-workspace\actividades_programacion\src\Tema_04\Problema_11.java
//Archivo salida del compilador: D:\eclipse-workspace\actividades_programacion\bin\Tema_04\Problema_11.class

package Tema_04;

import java.util.Scanner;

public class Problema_11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String frase;
		String fraseMayus;
		int pos;
		int contLetra;
		int totalLetras = 0;
		
		System.out.println("Escribe una frase de 60 caracteres o menos");
		frase = teclado.nextLine();
		
		while (frase.length() > 60) {
			System.out.println("La frase supera la longitud maxima de 60 caracteres");
			System.out.println("Escribe una frase de 60 caracteres o menos");
			frase = teclado.nextLine();
		}//while comprobar longitud de la frase
		
		System.out.println("La frase es:");
		System.out.println(frase);
		
		//Conversión de la frase a mayusculas
		fraseMayus = frase.toUpperCase();
		
		for (int letra = 65; letra < 91; letra++) {
			contLetra = 0;
			pos = fraseMayus.indexOf(letra);
			if (pos == -1)
				System.out.println("La letra " + (char) letra + " no esta.");
			else {
					contLetra++;
					totalLetras++;
					while (fraseMayus.indexOf( (char) letra, pos+1) != -1) {
					contLetra++;
					pos = fraseMayus.indexOf( (char) letra, pos+1);	

				}	//while
			System.out.println("La letra " + (char) letra + " esta " + contLetra + " veces.");
			
			}//else
				
		}//for
		System.out.println("La frase contiene " + totalLetras + " letras distintas");
	}//main

}//class