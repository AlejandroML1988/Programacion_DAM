package actividades_programacion;

import java.util.Scanner;


public class abc {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num = 0;
		int suma = 0;
		float cont = -1;
		int max = 0;
		int min = 0;
		float media = 0;
		
		
		do{
			System.out.println("Introduce un numero. Para parar, pulsa 0.");
			num = teclado.nextInt();
			suma += num;
			if (num > max) {
				max = num;
				if (min == 0)
					min = num;
			}//if
			if (num < min && num != 0)
				min = num;
			cont++;
			
		}//do
		while(num != 0);
		media = suma / cont;
		System.out.println("La media es: " + media);
		System.out.println("El maximo es: " + max);
		System.out.println("El minimo es: " + min);
	}//main

}//Problema_07