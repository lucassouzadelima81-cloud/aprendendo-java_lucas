package Aprendendo.Java.main.src.flamingo.intermediario.test;

import Aprendendo.Java.main.src.flamingo.intermediario.dominio.Carro;

import java.util.Scanner;

public class CarroTest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro carro1 = new Carro();

        System.out.println("digite seu nome: ");
        carro1.nome = sc.nextLine();

        System.out.println("digite a marca do carro: ");
        carro1.marca = sc.nextLine();

        System.out.println("digite o ano do carro: ");
        carro1.ano = sc.nextInt();

        System.out.println("digite a velocidade do carro: ");
        carro1.velocidade = sc.nextInt();

        System.out.println("nome: " + carro1.nome );
        System.out.println("marca: " + carro1.marca);
        System.out.println("ano: " + carro1.ano);

        System.out.println(carro1.verificarVelocidade(120));
    }
}
