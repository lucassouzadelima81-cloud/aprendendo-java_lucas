package flamingo.apredendo.indroducao;

public class Tiposprimitivos {

    static void main(String[]args) {
        //byte : -128 a 127
        // short : -32.768 a 32.768
        int municipio = 20000;
        short idade = 20;
        long contadobanco= 34566666l;
        float salario = 15000f;
        double salarioextra = 25000;
        char primieraletradonome = 'J';
        boolean vaiEstudarnasferias = false;
        System.out.println("Minha idade e " + idade);
        System.out.println("sao paulo " + municipio +" milhoes de moradores");
        System.out.println("minnha conta bancaria daqui a 5 anos " + contadobanco);
        System.out.println("meu salario dps de estudar com o bigas " + salario);
        System.out.println("pq caiu " + salarioextra);
        System.out.println("a primeira letra do meu nome e " + primieraletradonome);
        System.out.println(vaiEstudarnasferias);
    }
}
