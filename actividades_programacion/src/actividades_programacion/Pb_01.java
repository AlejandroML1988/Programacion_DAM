package actividades_programacion;
import java.util.Scanner;
public class Pb_01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int suma = 0;
		int a,b;
		System.out.println("Escribe A");
		a = teclado.nextInt();
		System.out.println("Escribe B");
		b = teclado.nextInt();
		if(a > b)
			System.out.println("Error, es mayor  A que B");
		else{
			for(int contador = a+1; contador <b; contador++)
				suma +=contador;
			System.out.println("La suma es: " + suma);
			
		}//else
	}//main

}//PB_01
