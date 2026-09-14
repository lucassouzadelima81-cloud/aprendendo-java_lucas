package faccatJaison;

import java.util.Scanner;

public class Exercicio07 {

    static void main(String[] args) {
        int dia, mes, ano;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite sua idade");
         ano = sc.nextInt();


        System.out.println("digite quantos meses adicional");
        mes  = sc.nextInt();


        System.out.println("digite quantos dias adicional");
        dia  = sc.nextInt();
        sc.close();
        ano=(ano*365)+(mes*30)+dia;
        System.out.println("seu dia e igual"+ano);
    }
}
