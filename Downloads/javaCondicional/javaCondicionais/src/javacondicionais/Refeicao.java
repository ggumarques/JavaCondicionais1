package javacondicionais;

import java.util.Scanner;

public class Refeicao {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Selecione o prato de 1 a 4: \n 1.Vegetariano \n 2.Peixe \n 3.Frango \n 4.Carne");
		int prato = scanner.nextInt();

		int calorias;
		int caloriass;
		int caloriasb;
		

		switch (prato) {
		case 1:
			calorias = 180;
			break;
		case 2:
			calorias = 230;
			break;
		case 3:
			calorias = 250;
			break;
		case 4:
			calorias = 350;
			break;
		default:
			calorias = 0;
			break;
			
		}
		System.out.format("Caloria do prato: %s \n", calorias);

		System.out.println("\n Selecione a sobremesa de 1 a 4: \n 1.Abacaxi \n 2.Sorvete diet \n 3.Mouse diet \n 4.Mouse Chocolate");
		int sobremesa = scanner.nextInt();

		switch (sobremesa) {
		case 1:
			caloriass = 75;
			break;
		case 2:
			caloriass = 110;
			break;
		case 3:
			caloriass = 170;
			break;
		case 4:
			caloriass = 200;
			break;
		default:
			caloriass = 0;
			break;

		}
		System.out.format("Caloria da sobremesa: %s \n", caloriass);

		System.out.println("\n Selecione a bebida de 1 a 4: \n 1.Chá \n 2.Suco de laranja \n 3.Suco de melão \n 4.Refrigerante");
		int bebida = scanner.nextInt();

		switch (bebida) {
		case 1:
			caloriasb = 75;
			break;
		case 2:
			caloriasb = 110;
			break;
		case 3:
			caloriasb = 170;
			break;
		case 4:
			caloriasb = 200;
			break;
		default:
			caloriasb = 0;
			break;

		}
		System.out.format("Caloria da sobremesa: %s \n", caloriasb);
		
		int total = (calorias + caloriass + caloriasb);
		System.out.format("Calorias totais: %s ", total);

	}
}
