package Turma_B;

import java.util.Scanner;

public class exercicio_10 {
    public static void main(String[] args) {
        int[] numbers_A = new int[4];
        int[] numbers_B = new int[4];
        int[] numbers_C = new int[4];
        int[] numbers_D = new int[4];

        Scanner us = new Scanner(System.in);

        // Preenchendo o array A com entrada do usuário
        for (int x = 0; x < numbers_A.length; x++) {
            System.out.print("Informe o valor " + (x + 1) + " de A: ");
            numbers_A[x] = us.nextInt();
        }

        // Mostrando os valores inseridos
        System.out.println("Valores inseridos no array A:");
        for (int x = 0; x < numbers_A.length; x++) {
            System.out.println("A[" + x + "] = " + numbers_A[x]);
        }

        us.close();
    }
}
