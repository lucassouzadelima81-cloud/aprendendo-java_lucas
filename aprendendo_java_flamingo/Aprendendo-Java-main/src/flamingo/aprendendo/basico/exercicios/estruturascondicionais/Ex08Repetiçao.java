package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

import java.util.Scanner;

public class Ex08Repetiçao {
    static void main(String[] args) {
        double valorProduto;
        int quantidade;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite a quantidade");
        quantidade = sc.nextInt();
        System.out.println("qual o valor?");
        valorProduto= sc.nextDouble();


        for (int contador = 0; contador <= 0; contador++) {
            System.out.println(quantidade * valorProduto);

        }
    }
}
