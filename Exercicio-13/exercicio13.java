/*Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos
valores da velocidade inicial (em m/s), da aceleração (m/s2) e do tempo de percurso
(em s) que serão digitados.
    Exercicio realizado em dupla: João Victor e Francielle
*/

import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double velocidadeInicial;
        double aceleracao;
        double tempo;
        double velocidadeFinal;

        System.out.println("Digite a velocidade inicial (m/s):");
        velocidadeInicial = scan.nextDouble();
        System.out.println("Digite a aceleracao (m/s2):");
        aceleracao = scan.nextDouble();
        System.out.println("Digite o tempo de percurso (s):");
        tempo = scan.nextDouble();
        System.out.println("A velocidade final em km/h e: ");

        velocidadeFinal = velocidadeInicial + (aceleracao * tempo);
        velocidadeFinal *= 3.6;

        System.out.println(velocidadeFinal);
    }
}
