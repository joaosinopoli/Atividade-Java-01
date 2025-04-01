/*Calcular e exibir a média geométrica de dois valores quaisquer que serão
digitados.
	Exercicio realizado em dupla: João Victor e Francielle

*/
import java.util.Scanner;

public class exercicio7{
	public static void main (String[] args){
	Scanner scan = new Scanner(System.in);
	
	double num1;
	double num2;
	double result;
	
	System.out.println("Digite o primeiro valor");
	num1 = scan.nextDouble();
	System.out.println("Digite o segundo valor");
	num2 = scan.nextDouble();
	
	result = Math.sqrt(num1*num2);
	System.out.println("A media geometria e :");
	System.out.println(result);
	
	
	
	
	
	}
	
	
}
