package Aprendendo.Java.main.src.flamingo.intermediario.dominio;

public class Carro {
    public String nome;
    public String marca;
    public int ano;
    public int velocidade;

    public boolean velocidadeAtual(int limite) {
        return velocidade > limite;
    }
    public String verificarVelocidade (int limite){
        if (velocidadeAtual(120)){
            return velocidade + "você foi multado";
        }
        return velocidade + "você não foi multado";
    }

}
