package flamingo.aprendendo.basico;

public class OperadoresParte05 {
    static void main(String[] args) {
       /*
        = atribuiçao simples
        += soma e atribui
       -= subtrçao e atribuiçao
       /= divisao e atribuiçao
       %= resto da divisao e atribuiçao

        */

        double totalCompra = 0;

        totalCompra += 50;
        totalCompra +=100;
        totalCompra +=50;

        totalCompra /= 2;

        System.out.printf("Total da compra = %.2f",totalCompra);
    }
}
