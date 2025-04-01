/*Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será
digitado.

Exercicio realizado em dupla: João Victor e Francielle

*/
import java.util.Scanner;

public class exercicio3{
	public static void main (String[] args){
	Scanner scan = new Scanner(System.in);
	
	double diagonal;
	double resultado;
	
	System.out.println("Digite o tamanho da diagonal do quadrado");
	diagonal = scan.nextDouble();
	resultado = ((diagonal/2)/2);
	System.out.println("A area do quadrado e: ");
	System.out.print(resultado);
		
	
	
	}
	
	
	
}