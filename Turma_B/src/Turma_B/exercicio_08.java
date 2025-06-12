package Turma_B;

public class exercicio_08 {
	public static void main(String[] args) {
		int soma_A=0,soma_B=0,soma_F=0;
		
		
		for( int i = 1; i <20;++i) {
			if( i %3==0) {
				soma_A+=i;
			}
		}
		System.out.println(+soma_A);
		
		for(int x = 1; x <=20;++x) {
			if(x %5==0) {
				soma_B+=x;
			}
		}
		System.out.println(+soma_B);
		
		soma_F= soma_A+soma_B;
		
		System.out.println(soma_F);
	}

}
