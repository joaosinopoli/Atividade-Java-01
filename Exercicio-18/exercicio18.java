/*Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um
valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco
que deverá ser devolvido.
    Exercicio realizado em dupla: João Victor e Francielle
*/

import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double produto1;
        double produto2;
        double produto3;
        double produto4;
        double produto5;
        double total;
        double pagamento;
        double troco;

        System.out.println("Digite o valor do primeiro produto:");
        produto1 = scan.nextDouble();
        System.out.println("Digite o valor do segundo produto:");
        produto2 = scan.nextDouble();
        System.out.println("Digite o valor do terceiro produto:");
        produto3 = scan.nextDouble();
        System.out.println("Digite o valor do quarto produto:");
        produto4 = scan.nextDouble();
        System.out.println("Digite o valor do quinto produto:");
        produto5 = scan.nextDouble();

        total = produto1 + produto2 + produto3 + produto4 + produto5;

        System.out.println("Digite o valor do pagamento:");
        pagamento = scan.nextDouble();
        System.out.println("O troco a ser devolvido e: ");

        troco = pagamento - total;

        System.out.println(troco);
    }
}
