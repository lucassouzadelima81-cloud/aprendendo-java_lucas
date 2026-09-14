package faccatJaison;

import java.util.Scanner;

public class Ex05 {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);{
            System.out.println("programa antecessor");
            System.out.println("digite um valor pra saber o seu antecessor");
            int numero= sc.nextInt();
            int antecessor= numero-1;

            System.out.println("o numero antecessor do valor digitado"+antecessor);
            sc.close();
        }
    }

}
