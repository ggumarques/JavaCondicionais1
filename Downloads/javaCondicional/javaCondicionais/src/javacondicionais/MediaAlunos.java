package javacondicionais;
import java.util.Scanner;

public class MediaAlunos {

	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);
		
		System.out.println("Insira a primeira nota: ");
		int n1 = valor.nextInt();
		
		System.out.println("Insira a segunda nota: ");
		int n2 = valor.nextInt();
		
		System.out.println("Insira a terceira nota: ");
		int n3 = valor.nextInt();
		
		int n4 = valor.nextInt();
		
		int media = (n1 + n2 + n3 + n4) / 4;
		
		System.out.println("Nota final: " + media);
		
		if (media >= 6) {
			System.out.println("O aluno passou");
		} else if (media == 5) {
			System.out.println("O aluno está de recuperação");
		} else {
			System.out.println("O aluno reprovou");
		}

	}

}
