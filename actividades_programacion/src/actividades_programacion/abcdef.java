//Programa que lee un número N por teclado y devuelve el número P, que es el primer primo mayor que N.
package actividades_programacion;
import java.util.Scanner;
public class abcdef {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num;
		int numP;
		int i=1;
		int j=2;
		int resto;
		boolean esPrimo;
		
		System.out.println("Introduce un número para saber el número primo siguiente a él");
		num = teclado.nextInt();
		do {
			do {
				resto = (num+i) % j;
				j++;
			}//do2
			
			while(j < (num + i) && resto != 0);

			if (resto != 0)
				esPrimo = true;
			
			else {
				esPrimo = false;
				i++;
				j=2;
			}//else
			
		}//do1
		while (!esPrimo);
		numP = num + i;
		if (num == 0 || num == 1)
			System.out.println("El siguiente número primo es 2");
		else

		
			System.out.println("El siguiente número primo es :" + numP);
	}//main

}//Problema_10