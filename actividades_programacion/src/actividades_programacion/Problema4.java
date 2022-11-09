package actividades_programacion;

import java.util.Scanner;


public class Problema4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num;
		int resto=0;
		int i=2;
		
		num = teclado.nextInt();

		
		while((i < num) && (resto != 0)) {
			resto = num % i;
			i++;
		}
		
		if (resto != 0)
			System.out.println("El numero es Primo");
		
		else
			System.out.println("El numero no es Primo");
	}//main
}//class

