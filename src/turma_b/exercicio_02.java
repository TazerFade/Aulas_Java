package turma_b;

import java.util.Scanner;

public class exercicio_02 {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Escreva 3 números:");
		double num_1 = entrada.nextDouble();
		double num_2 = entrada.nextDouble();
		double num_3 = entrada.nextDouble();
		
		double maior = Math.max(num_1,Math.max(num_2,num_3));
		System.out.println(maior);
	}
}