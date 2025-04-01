/*Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e
dois metros e que um quilômetro possui mil metros, fazer um programa para
converter milhas marítimas em quilômetros.
	Exercicio realizado em dupla: João Victor e Francielle

*/
import java.util.Scanner;

public class exercicio8{
	public static void main (String[] args){
	Scanner scan = new Scanner(System.in);
	
	double milhas;
	double quilometro;
	
	System.out.println("Digite a quantidade de milhas maritimas");
	milhas = scan.nextDouble();
	
	quilometro = milhas*1.852;
	
	System.out.println("A quantidade de milhas convertida em quilometros e : ");
	System.out.print(quilometro);

	
	
	
	
	}
	
	
}
