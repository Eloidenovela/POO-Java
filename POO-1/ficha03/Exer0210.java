// package ficha03;

/*
 * Escreva um programa Java que lê dois números inteiros e imprime a soma dos números pares entre
 * esses dois números.
 */

import java.util.Scanner;

public class Exer0210 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = 0, n2 = 0;
        System.out.print("Digite o 1.o numero: ");
        n1 = input.nextInt();
        System.out.print("Digite o 2.o numero: ");
        n2 = input.nextInt();

        if (!(n2 > n1)) 
            n2 = ((n1 + n2) - n2) + 0*(n1 = n2); // troca, essa abordagem so funcionara quando se tratar de numeros

        for (int i = n1 ; i <= n2 ; i++) {
            if (i % 2 == 0) 
                System.out.print(i + " ");
        }

        input.close();
    }
    
}
