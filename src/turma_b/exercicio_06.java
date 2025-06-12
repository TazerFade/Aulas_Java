package turma_b;

import java.util.Scanner;

public class exercicio_06 {
	public static void main(String[] args) {
	Scanner chama =new Scanner(System.in);
	
	 int contador = 0;

	System.out.println("Telefonou para a Vítima ?:S/N");
	char resp = chama.next().charAt(0);
	if (resp =='S'||resp=='s')contador++;
	System.out.println("Esteve no local do crime ?:S/N");
	char local = chama.next().charAt(0);
	if (local=='S'||resp=='s') contador ++;
	System.out.println("Mora perto da vítima ?: S/N");
	char house = chama.next().charAt(0);
	if (house=='S'||house=='s')contador++;
	System.out.println("Devia para a vítima ?:");
	char pay = chama.next().charAt(0);
	if ( pay=='S'||pay=='s')contador++;
	System.out.println("já trabalhou com a vítima ?:");
	char work = chama.next().charAt(0);
	if ( work =='s'|| work =='S') contador++;
	
 if(contador==5) {
	 syso
 }

	}

}
