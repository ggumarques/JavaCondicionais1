package javacondicionais;

import java.util.Scanner;

public class ABCDecrescente {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Insira um valor para A: ");
		int a = scanner.nextInt();
		
		System.out.println("Insira um valor para B: ");
		int b = scanner.nextInt();
		
		System.out.println("Insira um valor para C: ");
		int c = scanner.nextInt();
		
		if (a >= b && b >= c) {
			System.out.format("Valores decrescentes: %s, %s, %s .", a, b, c);
		} else if (b >= a && a >= c){
			System.out.format("Valores decrescentes: %s, %s, %s .", b, a, c);
		} else if (c >= b && b >= a) {
			System.out.format("Valores decrescentes: %s, %s, %s .", c, b, a);
		}
		
	}

}
