package Aprendendo.Java.main.src.flamingo.intermediario.test;

import Aprendendo.Java.main.src.flamingo.intermediario.dominio.Calculadora;

import java.util.Scanner;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("digite um numero ");
        int numero01 = sc.nextInt();

        System.out.println("digite outro numero ");
        int numero02 = sc.nextInt();


        calculadora.soma();
        calculadora.subtrair();
        calculadora.multiplicar(numero01, numero02);
    }
}
