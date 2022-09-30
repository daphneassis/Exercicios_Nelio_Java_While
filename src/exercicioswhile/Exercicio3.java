package exercicioswhile;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int combustivel= sc.nextInt();
		int soma_alcool=0;
		int soma_gasolina=0;
		int soma_diesel=0;
		while (combustivel!=4) {
			if(combustivel==1) {
				soma_alcool=soma_alcool+ 1;
			}else if(combustivel==2){
				soma_gasolina=soma_gasolina+1;
			}else if(combustivel==3){
				soma_diesel=soma_diesel+ 1;
			} 
			 combustivel=sc.nextInt();
		
		}
			System.out.println("MUITO OBRIGADA");
			System.out.println("Alcool:"+ soma_alcool);
			System.out.println("Gasolina:" +soma_gasolina);
			System.out.println("Diesel:"+ soma_diesel);}
}

