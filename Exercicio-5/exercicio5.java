/*Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que
será digitado.
	Exercicio realizado em dupla: João Victor e Francielle

*/
import java.util.Scanner;

public class exercicio5{
	public static void main (String[] args){
	Scanner scan = new Scanner(System.in);


	double diametro;
	double raio;
	double resultado;
	System.out.println("Digite o diametro da esfera: ");
	diametro = scan.nextDouble();
	raio = (diametro/2);
	
	resultado = (4/3)*Math.PI*Math.pow(raio,3);
	
	System.out.println("O volume da esfera e: ");
	System.out.println(resultado);
	
	}
	
	
}