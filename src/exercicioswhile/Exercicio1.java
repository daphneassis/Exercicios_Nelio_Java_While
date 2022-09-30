package exercicioswhile;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tentativa = sc.nextInt();
		int senha=2002;
		while(tentativa!=senha) {
			System.out.println("Senha inválida");
			 tentativa=sc.nextInt();
		}
		System.out.println("Acesso permitido");
	}

}
