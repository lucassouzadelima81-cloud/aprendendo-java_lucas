package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

import java.util.Scanner;

public class EstruturaRepetiçao02 {
    static void main(String[] args) {
        int numero;
        System.out.println("escolha seu numero");
        Scanner sc=new Scanner(System.in);
        numero= sc.nextInt();


        int contador=1;
        while (contador<=10) {
            System.out.println( contador + "x" + numero+"="+contador*numero);

            contador++;

        }
    }
}
