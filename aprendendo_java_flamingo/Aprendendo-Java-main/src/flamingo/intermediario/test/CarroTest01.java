package Aprendendo.Java.main.src.flamingo.intermediario.test;

import Aprendendo.Java.main.src.flamingo.intermediario.dominio.Carro;

public class CarroTest01  {
    static void main() {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();


        carro1.nome = "Civic";
        carro1.marca = "honda";
        carro1.ano = 1999;

        carro2.nome = "gol";
        carro2.marca = "volkswagen";
        carro2.ano = 2015;

        System.out.printf("""
                carro 01
                nome: %s
                marca: %s
                ano: %d
                
                --------------------
                
                
                carro 02
                nome: %s
                marca: %s
                ano: %d
                """,carro1.nome, carro1.marca, carro1.ano, carro2.nome, carro2.marca, carro2.ano);
    }

}
