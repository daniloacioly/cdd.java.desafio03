package aula001;
import java.util.Scanner;

public class desafio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		System.out.println("digite um numero: ");
		double resp = entrada.nextDouble();
			
		System.out.println( resp > 0 ?"numero positivo" : resp < 0 ? "negativo" : "neutro");
		

	}

}
