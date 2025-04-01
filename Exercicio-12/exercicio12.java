/*Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da
base que serão digitados.
	Exercicio realizado em dupla: João Victor e Francielle
*/

import java.util.Scanner;

public class exercicio12{
	public static void main (String[] args){
	Scanner scan = new Scanner(System.in);
	
	double volume;
	double raio;
	double altura;
	
	System.out.println("Digite o valor do raio:");
	raio = scan.nextDouble();
	System.out.println("Digite o valor da altura:");
	altura = scan.nextDouble();
	System.out.println(" O valor do volume e: ");
	
	volume = (Math.PI * Math.pow(raio, 2) * altura) / 3;
	
	System.out.println(volume);
	
	
	}
	
	
}

