package aula001;
import java.util.Scanner;
public class desafio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner primeiro = new Scanner(System.in);
		System.out.println("digite um numero: ");
		double nota1 = primeiro.nextDouble();
		
		Scanner segundo = new Scanner(System.in);
		System.out.println("digite um numero: ");
		double nota2 = segundo.nextDouble();
		double media = ((nota1 + nota2) / 2);
		
		System.out.println(media);
		
		if (media >= 7) {
			System.out.println("aprovado");
		}
		else if (media >= 4) {
			System.out.println("recuperação");
		}
		else {
			System.out.println("reprovado");
		}
	}

}
