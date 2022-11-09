package actividades_programacion;
import java.util.Scanner;

public class Problema_num01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int oper;
		int num1,num2,res;
		int bien=0;
		int mal=0;
		boolean aux=true;
		
		System.out.println("Introduzca una operación:");
		System.out.println("Suma: 1");
		System.out.println("Resta: 2");
		System.out.println("Multiplicacion: 3");
		
		oper = teclado.nextInt();
		


		for (int i = 0; i < 10; i++) {	
			switch (oper){
			case 1: //Suma
				num1 =(int)(Math.random()*20)+1;
				num2 =(int)(Math.random()*20)+1;
				System.out.println("Suma: " + num1 + " + " + num2 + " = ");
				res = teclado.nextInt();
				if(res == num1 + num2) {
					bien += 1;
					System.out.println("Respuesta correcta");
				}//if
				else {
					mal += 1;
					System.out.println("Respuesta incorrecta");
				}//else
			break;
			
			case 2: //Resta
				num1 =(int)(Math.random()*20)+1;
				num2 =(int)(Math.random()*20)+1;
				System.out.println("Suma: " + num1 + " - " + num2 + " = ");
				res = teclado.nextInt();
				if(res == num1 - num2) {
					bien += 1;
					System.out.println("Respuesta correcta");
				}//if
				else {
					mal += 1;
					System.out.println("Respuesta incorrecta");
				}//else
			break;
			case 3:
				num1 =(int)(Math.random()*20)+1;
				num2 =(int)(Math.random()*20)+1;
				System.out.println("Suma: " + num1 + " * " + num2 + " = ");
				res = teclado.nextInt();
				if(res == num1 * num2) {
					bien += 1;
					System.out.println("Respuesta correcta");
				}//if
				else {
					mal += 1;
					System.out.println("Respuesta incorrecta");
				}//else
			break;
			
			default:
				System.out.println("Error, opcion invalida");
				
			}//switch
	
		}//for	
	
		System.out.println("Numero de respuestas correctas: " + bien);
		System.out.println("Numero de respuestas incorrectas: " + mal);
	



	}//main

}//clase
