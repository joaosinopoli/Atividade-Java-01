/*Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as
seguintes funções trigonométricas: seno, cosseno, tangente e secante deste ângulo.
Lembre-se que uma função trigonométrica trabalha em radianos.
    Exercicio realizado em dupla: João Victor e Francielle
*/

import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double angulo;
        double radianos;
        double seno;
        double cosseno;
        double tangente;
        double secante;

        System.out.println("Digite o valor do angulo em graus:");
        angulo = scan.nextDouble();
        System.out.println("Os valores das funcoes trigonometricas sao: ");

        radianos = Math.toRadians(angulo);
        seno = Math.sin(radianos);
        cosseno = Math.cos(radianos);
        tangente = Math.tan(radianos);
        secante = 1 / cosseno;

        System.out.println("Seno: " + seno);
        System.out.println("Cosseno: " + cosseno);
        System.out.println("Tangente: " + tangente);
        System.out.println("Secante: " + secante);
    }
}
