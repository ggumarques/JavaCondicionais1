package javacondicionais;

import java.util.Scanner;
import java.util.Calendar;

public class Eleitor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Calendar calendario = Calendar.getInstance();
		int ano = calendario.get(Calendar.YEAR);

		System.out.println("Digite o ano de nascimento do eleitor: ");
		int anoNasc = scanner.nextInt();
		
		int idade = ano - anoNasc;
		System.out.format("Idade do eleitor: %s", idade);
		

		boolean eleitor = (ano - anoNasc) >= 18 && (ano - anoNasc) <= 64;
		boolean naoEleitor = (ano - anoNasc) < 16;
		boolean faculEleitor = (ano - anoNasc) > 65 || (ano - anoNasc) >= 16 && (ano - anoNasc) <= 17 ;

		if (eleitor) {
			System.out.println("\nEleitor elegível. Se dirija ao ponto de votação mais próximo, cidadão!");
		} else if (naoEleitor){
			System.out.println("\nNão eleitor. Aguarde completar 16 anos, cidadão!");
		} else if (faculEleitor){
			System.out.println("\nEleitor facultativo");
		}
	}
}
