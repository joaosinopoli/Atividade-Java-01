/*Calcular e exibir a média aritmética de quatro valores quaisquer que serão
digitados.

	Exercicio realizado em dupla: João Victor e Francielle

*/
import java.util.Scanner;

public class exercicio6{
	public static void main (String[] args){
	Scanner scan = new Scanner(System.in);
	
	double num1;
	double num2;
	double num3;
	double num4;
	double media;
	
	System.out.println("Digite o primeiro valor");
	num1 = scan.nextDouble();
	System.out.println("Digite o segundo valor");
	num2 = scan.nextDouble();
	System.out.println("Digite o terceiro valor");
	num3 = scan.nextDouble();
	System.out.println("Digite o quarto valor");
	num4 = scan.nextDouble();
	
	media = (num1+num2+num3+num4)/4;
	
	System.out.println("A media e: ");
	System.out.println(media);
	

	
	}
	
	
}