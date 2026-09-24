package Aprendendo.Java.main.src.flamingo.intermediario.test;

import Aprendendo.Java.main.src.flamingo.intermediario.dominio.Curso;

import java.util.Scanner;

public class CursoTest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Curso curso = new Curso();

        System.out.println("digite seu nome");
        String nome = sc.nextLine();
        curso.nome = nome;

        System.out.println("digite a duração do seu curso");
        String duracao = sc.nextLine();
        curso.duracaoAnos = duracao;

        System.out.println("digite o valor da sua mensalidade");
        double mensalidade = sc.nextDouble();
        curso.mensalidade = mensalidade;

        System.out.println("digite o modelo do seu curso");
        String modelos = sc.nextLine();
        curso.modelo = modelos;

        System.out.println("digite o turno que é seu curso");
        String turnos = sc.nextLine();
        curso.turno = turnos;

        System.out.println(curso.nome);
        System.out.println(curso.duracaoAnos);
        System.out.println(curso.mensalidade);
        System.out.println(curso.modelo);
        System.out.println(curso.turno);
    }
}
