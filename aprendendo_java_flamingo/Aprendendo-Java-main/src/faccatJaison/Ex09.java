package faccatJaison;

import java.util.Scanner;

public class Ex09 {
    static void main(String[] args) {
        double salario;
        double percentual;
        Scanner sc=new Scanner(System.in);
        System.out.println("qual seu salario atual??");
        salario=sc.nextDouble();
        System.out.println("qual seu percentual??");
        percentual= sc.nextDouble();
        salario=salario*percentual/100;
        System.out.println("seu salario com o aumento de percentual é R$"+salario);

    }
}
