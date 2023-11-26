package aula001;
import java.util.Scanner;
public class desafio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		System.out.println("digite um numero: ");
		double resp = entrada.nextDouble();
		
		if (resp == 1) {
			System.out.println("domingo");
		}
		else if (resp == 2) {
			System.out.println("segundafeira");
		}
		else if (resp == 3) {
			System.out.println("terça-feira");
		}
		else if (resp == 4) {
			System.out.println("quarta-feira");
		}
		else if (resp == 5) {
			System.out.println("quinta-feira");
		}
		else if (resp == 6) {
			System.out.println("sexta-fera");
		}
		else if (resp == 7) {
			System.out.println("sabado");
		}
		else {
			System.out.println("valor invalido");
		}
	}

}

