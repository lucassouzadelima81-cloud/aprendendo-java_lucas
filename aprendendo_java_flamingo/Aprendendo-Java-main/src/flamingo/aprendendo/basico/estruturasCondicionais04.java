package flamingo.aprendendo.basico;
import java.util.Scanner;

public class estruturasCondicionais04 {
    void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("escolha uma opçao: ");
        byte diaSemana = sc.nextByte();

        switch (diaSemana){
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("a");
                break;
            case 3:
                System.out.println("b");
                break;
            case 4:
                System.out.println("c");
                break;
            case 5 :
                System.out.println("f");
                break;
            case 6:
                System.out.println("d");
                break;
            case 7:
                System.out.println("g");
                break;
            default:
                System.out.println("Essa opçao nao existe");
                break;
        }

    }
}
