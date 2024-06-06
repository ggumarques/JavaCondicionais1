package javacondicionais;

import java.util.Scanner;

public class DivisivelDez {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero % 10 == 0 && numero % 5 == 0 && numero % 2 == 0) {
            System.out.println("O número é divisível por 10, por 5  e por 2.");
        }else if (numero % 10 == 0) {
        	System.out.println("O número não é divisível por 10.");
        } else if (numero % 5 == 0){
            System.out.println("O número não é divisível por 5.");
        }else if (numero % 2 == 0){
            System.out.println("O número não é divisível por 2.");
        }
    }

}


