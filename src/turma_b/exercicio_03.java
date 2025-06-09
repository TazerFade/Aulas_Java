package turma_b;

import java.util.Scanner;

public class exercicio_03 {
	public static void main(String[] args) {
		Scanner chama = new Scanner(System.in);
		System.out.println("Infrome o NÚMERO correspondente ao dia desejado:");
		int dia = chama.nextInt();

		String result = dia==1?"Domingo":dia==2?"Segunda":dia==3?"terça":dia==4?"Quarta":dia==5?"Quinta":dia==6?"Sexta":dia==7?"Sábado":"dia inválido";
		System.out.println(result);
	}

}
