package Turma_B;

import java.util.Scanner;

public class exercicio_01 {
	public static void main(String[] args) {
		int qtd=0, x=0;
		double nota =0, soma=0, media=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qtd de alunos: ");
		qtd = sc.nextInt();
		
		while(x < qtd ) {
			System.out.printf("Digite a nota %.2f",media);
			nota =sc.nextDouble();
			soma+=nota;
			x++;
		}
		
		 media = soma / qtd;
	        System.out.printf("Média da turma: %.2f\n", media);
	}

}
