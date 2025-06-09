package turma_b;

import java.util.Scanner;

public class exercicio_04 {
	public static void main(String[] args) {
		Scanner chama = new Scanner(System.in);
		System.out.println("Informe as respectivas notas:");
		double nt_1 = chama.nextDouble();
		double nt_2 = chama.nextDouble();
		
		double media =(nt_1+nt_2)/2;
		System.out.println(media);
	}

}
