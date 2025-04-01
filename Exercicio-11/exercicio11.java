/*A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área
	Exercicio realizado em dupla: João Victor e Francielle
*/

import java.util.Scanner;

public class exercicio11{
	public static void main (String[] args){
	Scanner scan = new Scanner(System.in);
	
	double area;
	double diametro;
	
	System.out.println("Digite o diamentro do ciruclo");
	diametro = scan.nextDouble();
	
	area =  Math.PI*Math.pow((diametro/2),2);
	System.out.println("A area e :");
	System.out.println(area);
	
	
	
	}
	
	
}

