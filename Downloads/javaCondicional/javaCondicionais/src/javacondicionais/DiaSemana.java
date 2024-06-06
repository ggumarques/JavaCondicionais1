package javacondicionais;

import java.util.Scanner;

public class DiaSemana {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Insira um valor de 1 a 7: ");
		int numero_dia = scanner.nextInt();
		String nome_Dia;

		switch (numero_dia) {
		case 1:
			nome_Dia = "Domingo";
			break;
		case 2:
			nome_Dia = "Segunda-feira";
			break;
		case 3:
			nome_Dia = "terça-feira";
			break;
		case 4:
			nome_Dia = "Quarta-feira";
			break;
		case 5:
			nome_Dia = "Quinta-feira";
			break;
		case 6:
			nome_Dia = "Sexta-feira";
			break;
		case 7:
			nome_Dia = "Sabado";
			break;
		default:
			nome_Dia = "Dia Inválido";
			break;
		}

		System.out.format("Dia: %s, cai numa: %s .", numero_dia, nome_Dia);

	}
}
