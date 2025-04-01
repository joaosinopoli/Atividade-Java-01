/*Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será
digitado.

exercicio realizado em dupla : João Victor e Francielle

*/




import java.util.Scanner;
public class exercicio2{
	public static void main (String[] args){
	Scanner scan = new Scanner(System.in);
	
	int aresta;
	int resultado;
	
	System.out.println("Digite o tamanho da aresta: ");
	aresta = scan.nextInt();
	resultado = (aresta * aresta);
	System.out.println("A area do quadrado e: ");
	System.out.print(resultado);
	

	
		
	
	
	}
		
	
}