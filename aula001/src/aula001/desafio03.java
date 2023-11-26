package aula001;
import java.util.Scanner;
public class desafio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		System.out.println("digite um numero: ");
		double resp1 = entrada.nextDouble();
		
		Scanner meio = new Scanner(System.in);
		System.out.println("digite um numero: ");
		double resp2 = meio.nextDouble();
		
		Scanner saida = new Scanner(System.in);
		System.out.println("digite um numero: ");
		double resp3 = saida.nextDouble();
		
		if (resp1 > resp2 && resp1 > resp3){
			System.out.println("O primeiro numero é o maior");
			if (resp2 > resp3) {
				System.out.println("o terceiro numero e o menor");
				}
			else {
					System.out.println("O segundo numero e o menor");
				}	
		}
		else if (resp2 > resp1 && resp2 > resp3){
			System.out.println("O segundo numero é o maior");
			if (resp3 > resp1) {
				System.out.println("o primeiro numero é o menor");
			}
			else {
				System.out.println("o terceiro numero é o menor");
			}
		}
		else if(resp3 > resp1 && resp3 > resp2) {
			System.out.println("O terceiro numero é o maior");
			if (resp2 > resp1) {
				System.out.println("o primeiro numero é o menor");
			}
			else {
				System.out.println("o segundo numero é o menor");
			}
		}
	}

}
