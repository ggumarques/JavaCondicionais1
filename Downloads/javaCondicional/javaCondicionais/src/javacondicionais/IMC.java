package javacondicionais;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {

		Scanner valor = new Scanner(System.in);
		// IMC = peso / (altura * altura)
		// < 18.5 magreza, 18,5 a 24,9 normal, 25 a 29,9 sobrepeso,
		// 30 a 34,9 obesidade grau 1

		System.out.println("Insira o peso: ");
		float peso = valor.nextFloat();

		System.out.println("Insira a altura: ");
		float altura = valor.nextFloat();

		float imc = peso / (altura * altura);

		System.out.println("Peso: " + peso + "\nAltura: " + altura + "\nIMC: " + imc);

		if (imc < 18.5) {
			System.out.println(" Magreza");
		} else if (imc >= 18.5 && imc <= 24.9) {
			System.out.println(" Normal");
		} else if (imc >= 25 && imc <= 29.9) {
			System.out.println(" Sobrepeso");
		} else if (imc >= 30 && imc <= 34.9) {
			System.out.println(" Obesidade");
		}
	}

}