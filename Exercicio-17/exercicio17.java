/*Entrar via teclado com dois valores quaisquer �X� e �Y�. Calcular e exibir o
c�lculo XY (�X� elevado a �Y�). Pesquisar as fun��es Exp e Ln.
    Exercicio realizado em dupla: Jo�o Victor e Francielle
*/

import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x;
        double y;
        double resultado;

        System.out.println("Digite o valor de X:");
        x = scan.nextDouble();
        System.out.println("Digite o valor de Y:");
        y = scan.nextDouble();
        System.out.println("O valor de X elevado a Y e: ");

        resultado = Math.pow(x, y);

        System.out.println(resultado);
    }
}
