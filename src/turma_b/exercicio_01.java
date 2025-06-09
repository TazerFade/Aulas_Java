package turma_b;

import java.util.Scanner;

public class exercicio_01 {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Digite seu número:");
		double resp = entrada.nextDouble();
		
		String resultado = resp==0?"zero":resp>0?"Positivo":"Negativo";
		System.out.println(resultado);
			}
}