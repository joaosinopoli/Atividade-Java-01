/*Calcular e exibir o volume livre de um ambiente que contem uma esfera de raio
"r" inscrita em um cubo perfeito de aresta "a". Os valores de "r" e "a" serao
digitados.
    Exercicio realizado em dupla: João Victor e Francielle
*/

import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double raio;
        double aresta;
        double volumeCubo;
        double volumeEsfera;
        double volumeLivre;

        System.out.println("Digite o valor da aresta do cubo:");
        aresta = scan.nextDouble();
        System.out.println("Digite o valor do raio da esfera:");
        raio = scan.nextDouble();
        System.out.println("O volume livre do ambiente e: ");

        volumeCubo = Math.pow(aresta, 3);
        volumeEsfera = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
        volumeLivre = volumeCubo - volumeEsfera;

        System.out.println(volumeLivre);
    }
}
