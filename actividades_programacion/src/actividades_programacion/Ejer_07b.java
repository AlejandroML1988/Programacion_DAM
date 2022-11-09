//Programa que lee números por teclado, imprime al final la media de todos ellos, el máximo y el mínimo.

package actividades_programacion;
import java.util.Scanner;
public class Ejer_07b {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		int num =0;
		float suma=0;
		int max=0;
		int min=0;
		double med=0;
		float cont = 0;
		
		System.out.println("Introduzca un numero");
		num=teclado.nextInt();
		
		while(num!=0) {
			suma += num;
			
			if(num < min)
				min = num;
			
			if(num > max)
				max = num;
			cont++;
			System.out.println("Introduzca un numero");
			num=teclado.nextInt();
		}
		med =   suma / cont;
		System.out.println(med);
		
		
	}//main

}//Ejer_07b
