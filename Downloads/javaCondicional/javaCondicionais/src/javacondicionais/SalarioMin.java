package javacondicionais;

import java.util.Scanner;

public class SalarioMin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float salarM = 1212.0f;

        System.out.println("Digite seu salário: ");
        float salar = scanner.nextFloat();

        float salT = (salar / salarM);

        if (salarM > salar) {
            System.out.println("Conquiste o segundo emprego, Julius!");
        } else {
            System.out.format("Julius tem dois empregos! Salário equivale a: %.2f salários mínimos%n", salT); 
        }
    }
}
