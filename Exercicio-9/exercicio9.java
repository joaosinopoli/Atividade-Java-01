/*Calcular e exibir a tens�o de um determinado circuito eletr�nico a partir dos
valores da resist�ncia e corrente el�trica que ser�o digitados. Utilize a lei de Ohm.
	Exercicio realizado em dupla: Jo�o Victor e Francielle

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

