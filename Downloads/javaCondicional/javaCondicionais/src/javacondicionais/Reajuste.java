package javacondicionais;

import java.util.Scanner;

public class Reajuste {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu salário: ");
        float salar = scanner.nextFloat();

        float reajuste = (salar * 1.015f); // Correção: multiplicar por 1.015 para aplicar um aumento de 1.5%

        System.out.format("%nSalario reajustado em: R$%.2f adicionando valor de R$%.2f%n ", reajuste, reajuste-salar);
    }
}
