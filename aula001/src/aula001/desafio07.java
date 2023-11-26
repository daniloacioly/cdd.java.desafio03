package aula001;
import java.util.Scanner;
public class desafio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner pergunta = new Scanner(System.in);
		System.out.println("digite um numero: 1 para sim, 2 para não ");
		System.out.println("telefonou para a vitima ?");
		
		int cont = 0;
		
		int resp = pergunta.nextInt();
		
		if (resp == 1) {
			cont++;
		}
		
		System.out.println("esteve no local do crime ?");
		
		resp = pergunta.nextInt();
		
		if (resp == 1) {
			cont++;
		}
		
		System.out.println("mora perto da vitima ?");
		
		resp = pergunta.nextInt();
		
		if (resp == 1) {
			cont++;
		}
		
		System.out.println("devia para a vitima ?");
		
		resp = pergunta.nextInt();
		
		if (resp == 1) {
			cont++;
		}
		
		System.out.println("ja trabalhou com a vitima ?");

		resp = pergunta.nextInt();
		
		if (resp == 1) {
			cont++;
}
		if (cont == 2) {
			System.out.println("suspeito");
		}
		else if (cont == 3 || cont == 4) {
			System.out.println("cumplice");
		}
		else if (cont == 5) {
			System.out.println("assassino");
		}
		else {
			System.out.println("inocente");
		}
}
}
