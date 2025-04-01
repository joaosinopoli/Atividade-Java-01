//Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua
//área.

/* exercicio realizado em dupla : João Victor e Francielle*/

import java.util.Scanner;

public class exercicio1{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	
	double base;
	double altura;
	double resultado;
	
	System.out.println("Digite a altura do retangulo");
	altura = scan.nextDouble();
	System.out.println("Digite a base do retangulo");
	base = scan.nextDouble();
	
	resultado = (base*altura);
	System.out.println("A area do retangulo e: ");
	System.out.print(resultado);
	
		
	}
	
}