package turma_b;

import java.util.Scanner;

public class exercicio_05 {
	public static void main(String[] args) {
		  Scanner chama = new Scanner(System.in);
	        System.out.println("Digite F para feminino e M para masculino: ");
	        char letra = chama.next().charAt(0);
	        
	        if(letra=='F') {
	        	System.out.println("Feminino");
	        }else if(letra=='M') {
	        	System.out.println("Masculino");
	        }else {
	        	System.out.println("Caractere inválido");
	        }

	}
}