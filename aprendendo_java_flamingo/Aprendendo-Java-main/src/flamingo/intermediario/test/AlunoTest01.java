package Aprendendo.Java.main.src.flamingo.intermediario.test;

import Aprendendo.Java.main.src.flamingo.intermediario.dominio.Aluno;

public class AlunoTest01 {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno();

        aluno01.nome = "bigas";
        aluno01.nota = 8.5;

        System.out.println("aluno: " + aluno01.nome);
        System.out.println("nota: " + aluno01.nota);
        System.out.println("aprovado: " + aluno01.isAprovado());
        System.out.println(aluno01.verificarConvite());
    }
}
