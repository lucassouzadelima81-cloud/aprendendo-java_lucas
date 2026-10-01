package Aprendendo.Java.main.src.flamingo.intermediario.dominio;

public class Aluno {
    public String nome;
    public double nota;

    public boolean isAprovado() {
        return nota >= 7;
    }

    public String verificarConvite(){
        if (isAprovado()){
            return nome + "foi aprovado e recebeu o convite para a festa.";
        }
        return nome + "não foi aprovado e não recebeu convite. ";
    }
}
