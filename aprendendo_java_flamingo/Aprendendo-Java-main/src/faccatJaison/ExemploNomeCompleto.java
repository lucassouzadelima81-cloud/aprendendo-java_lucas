package Aprendendo.Java.main.src.faccatJaison;

public class ExemploNomeCompleto {
    static void exibirNomeCompleto(String nome){
        System.out.println("O nome completo do paciente é: " + nome + " Silva ");
    }

    public static void main(String[] args) {
        exibirNomeCompleto("pedro");
        exibirNomeCompleto("paulo");
        exibirNomeCompleto("lucas");
    }
}
