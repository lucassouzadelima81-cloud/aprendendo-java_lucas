package flamingo.aprendendo.basico;

public class EstruturasCondicionaisParte02 {
    static void main(String[] args) {

//        byte idade = 17;
//
//        if(idade>=18){
//            System.out.println("pode comprar bebida");
//        }else{
//            System.out.println("nao pode comprar bebida");
//        }

        byte idade =20;
        String categoria;

        if(idade<15){
            categoria = "categoria infatil";
        }else if ( idade <18){
            categoria = "categoria juvenil";
        }else{
            categoria = "categoria adulta";
        }
        System.out.println(categoria);

    }
}
