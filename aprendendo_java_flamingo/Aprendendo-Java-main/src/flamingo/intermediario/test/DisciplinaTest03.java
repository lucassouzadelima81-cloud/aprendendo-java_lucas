package Aprendendo.Java.main.src.flamingo.intermediario.test;

import Aprendendo.Java.main.src.flamingo.intermediario.dominio.Disciplina;

import java.util.Scanner;

public class DisciplinaTest03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Disciplina disciplina = new Disciplina();

        System.out.println("digite o seu nome");
        String nome = sc.nextLine();
        disciplina.nome = nome;

        System.out.println("dgite a sua carga horaria");
        int cargaDeHoras = Integer.parseInt(sc.nextLine());
        disciplina.cargaHoraria = cargaDeHoras;

        System.out.println("digite o nome do professor");
        String nomeProf = sc.nextLine();
        disciplina.nomeProfessor = nomeProf;

        System.out.println("digite o semestre que vc esta");
        int semestres = sc.nextInt();
        disciplina.semestre = semestres;

        System.out.println(disciplina.nome);
        System.out.println(disciplina.cargaHoraria);
        System.out.println(disciplina.nomeProfessor);
        System.out.println(disciplina.semestre);
    }
}
