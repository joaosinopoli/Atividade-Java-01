/*Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos
valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.
	Exercicio realizado em dupla: João Victor e Francielle

*/
import java.util.Scanner;

public class exercicio9{
	public static void main (String[] args){
	Scanner scan = new Scanner(System.in);
	
	double resistencia;
	double corrente;
	double tensao;
	
	System.out.println("Digite o valor da resistencia");
	resistencia = scan.nextDouble();
	System.out.println("Digite o valor da corrente");
	corrente = scan.nextDouble();
	tensao = resistencia*corrente;
	
	System.out.println("O resultado da tensao e :");
	System.out.println(tensao);
	

	
	
	
	
	}
	
	
}

