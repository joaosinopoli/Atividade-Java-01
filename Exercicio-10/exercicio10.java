/*Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e
exibir sua temperatura equivalente em Fahrenheit.
	Exercicio realizado em dupla: João Victor e Francielle
*/

import java.util.Scanner;

public class exercicio10{
	public static void main (String[] args){
	Scanner scan = new Scanner(System.in);
	
	double celsius;
	double fahr;
	
	System.out.println("Digite o valor em Celsius");
	celsius = scan.nextDouble();
	System.out.println("O valor em Fahrenheit e: ");
	fahr = (celsius*1.8)+32;
	System.out.println(fahr);
	
	
	
	
	}
	
	
}

