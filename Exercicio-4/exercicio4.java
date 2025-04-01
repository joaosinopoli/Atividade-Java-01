/*A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.
	
	Exercicio realizado em dupla: João Victor e Francielle

*/
import java.util.Scanner;

public class exercicio4{
	public static void main (String[] args){
	Scanner scan = new Scanner(System.in);

	double base;
	double altura;
	double resultado;
	
	System.out.println("Digite a base do triangulo");
	base = scan.nextDouble();
	System.out.println("Digite a altura do triangulo");
	altura = scan.nextDouble();
	
	resultado = ((base*altura)/2);
	System.out.println("O resultado da area do triangulo e: ");
	System.out.println(resultado);
	
	
	}
	
	
}