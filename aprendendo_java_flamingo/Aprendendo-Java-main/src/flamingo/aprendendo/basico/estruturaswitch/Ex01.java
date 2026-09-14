package flamingo.aprendendo.basico.estruturaswitch;

import java.util.Scanner;

public class Ex01 {
    static void main(String[] args) {
        byte tipoCombustivel;
        double litros,preco;

        Scanner sc =new Scanner(System.in);

        System.out.printf("""
                qual o tipo de combustivel?
                1)gasolina
                2)etanol
                3)diesel
                """);

        tipoCombustivel= sc.nextByte();

        switch (tipoCombustivel) {
            case 1:
                System.out.println("quantos litros de gasolina vc deseja");
                litros = sc.nextDouble();
                preco = litros * 5.89;

                System.out.printf("preço total do combustivel é R$%f", preco);
                break;
            case 2:
                System.out.println("quantos litros de etanol vc deseja");
                litros = sc.nextDouble();
                preco = litros * 3.99;

                System.out.printf("preço total do combustivel é R$%f", preco);
                break;
            case 3:
                System.out.println("quantos litros de diesel vc deseja");
                litros = sc.nextDouble();
                preco = litros * 6.19;

                System.out.printf("preço total do combustivel é R$%f", preco);
                break;
            default:
                System.out.println("Nao existe essa opçao!");
                break;
        }
        sc.close();
    }
}
