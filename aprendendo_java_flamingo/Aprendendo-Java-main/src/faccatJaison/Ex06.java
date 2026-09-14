package faccatJaison;

import java.util.Scanner;

public class Ex06 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("programa sucessor");
            System.out.println("digite um valor pra saber o seu sucessor");
            int numero = sc.nextInt();
            int sucessor = numero + 1;

            System.out.println("o numero sucesssor do valor digitado "  + sucessor);
            sc.close();
        }
    }
}
