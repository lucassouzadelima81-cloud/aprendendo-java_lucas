package faccatJaison;

import java.util.Scanner;

public class retangularEx {
    static void main(String[] args) {
        double altura,base,area;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite a base do rentagulo");
        base = sc.nextDouble();

        System.out.println("digite a altura do rentagulo");
        altura=sc.nextDouble();

         area=base*altura;

        System.out.printf("a aerea do rentagulo = %.2ff",area);
        sc.close();

    }
}
