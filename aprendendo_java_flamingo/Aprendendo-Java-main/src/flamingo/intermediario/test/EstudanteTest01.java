package Aprendendo.Java.main.src.flamingo.intermediario.test;

import Aprendendo.Java.main.src.flamingo.intermediario.dominio.Estudante;

import java.util.Scanner;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Estudante estudante = new Estudante();

        System.out.println("digite o nome do estudante");
        String nome = sc.nextLine();
        estudante.nome = nome;

        System.out.println("digite a idade do estudante");
        int idade = Integer.parseInt(sc.nextLine());
        estudante.idade = idade;

        System.out.println("digite o rg do estudante");
        String rg = sc.nextLine();
        estudante.rg = rg;

        System.out.println("digite o telefone do aluno");
        String tel =  sc.nextLine();
        estudante.tel = tel;

        System.out.println("digite o nome do curso do aluno");
        String curso = sc.nextLine();
        estudante.curso = curso;

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.rg);
        System.out.println(estudante.tel);
        System.out.println(estudante.curso);

    }
}
