package aula001;
import java.util.Scanner;
public class desafio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		System.out.println("digite uma letra: ");
		char letra = entrada.next().charAt(0);
		
		if (letra == 'f'){
			System.out.println("Feminino");
		}
		else if (letra == 'm') {
			System.out.println("Masculino");
		}
		else {
			System.out.println("entrada encorreta");
		}
		
		entrada.close();
	}

}