package actividades_programacion;

import java.util.Scanner;

public class Problema_12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int figura;
		int base;
		int altura;
		float area;
		
		System.out.println("Elija una figura de las siguiente:");
		System.out.println("1 --> Triangulo");
		System.out.println("2 --> Rectangulo");
		System.out.println("3 --> Cuadrado");
		
		figura = teclado.nextInt();
		System.out.println("Ha elegido: " + figura);
		System.out.println("Introduzca la base del " + figura);
		base = teclado.nextInt();
		System.out.println("La base es : " + base);

		System.out.println("Introduzca la altura del " + figura);
		altura = teclado.nextInt();
		System.out.println("La altura es " + altura);
		
		if(figura == 1) {
			area = (base * altura) / 2;
		}//if
		
		else {
			area = base * altura;
		}//else
		
		System.out.println("El area de un " + figura + " con base " + base + " y altura " + altura + " es: " + area);
	}//main

}//Problema_12
