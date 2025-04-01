/*Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de
dólares. Calcular e exibir o valor correspondente em Reais (R$).
    Exercicio realizado em dupla: João Victor e Francielle
*/

import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double cotacao;
        double quantidade;
        double valorReais;

        System.out.println("Digite a cotacao do dolar:");
        cotacao = scan.nextDouble();
        System.out.println("Digite a quantidade de dolares:");
        quantidade = scan.nextDouble();
        System.out.println("O valor em reais e: ");

        valorReais = cotacao * quantidade;

        System.out.println(valorReais);
    }
}
