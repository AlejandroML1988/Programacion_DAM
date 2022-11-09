//Problema programacion num 1
package actividades_programacion;

import java.util.Scanner;

public class ClaseA {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int num;
		
		System.out.println("Introduzca el número para saber ver su tabla de multiplicar");
		num = teclado.nextInt();
		System.out.println("El número introducido es: " + num);
		
		if(num < 1) {
			System.out.println("El número debe ser entre 1 y 10");
		} else if(num > 10){
			System.out.println("El número debe ser entre 1 y 10");
		} else {
			for(int i=1; i < 11; i++) {
				System.out.println(num + " * " + i + " = " + (i * num));
			}
			
			
		}
	}
	
}



