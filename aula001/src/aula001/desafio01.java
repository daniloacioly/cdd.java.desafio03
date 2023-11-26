package aula001;
import java.util.Scanner;
public class desafio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite um numero: ");
		double resp = entrada.nextDouble();

		if(resp < 0 ){
			System.out.println("negativo");
		}
		else {
			System.out.println("positivo");
		}
	}

}
