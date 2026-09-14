package faccatJaison;

import java.util.Scanner;

public class Ex08 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalEleitores, votosBrancos, votosNulos, votosValidos;
        double percentualBrancos, percentualNulos, percentualValidos;


        System.out.println("digite o total de eleitores");
        totalEleitores=sc.nextDouble();

        System.out.println("digite o total de votos brancos");
        votosBrancos=sc.nextDouble();

        System.out.println("digite o total de votos nulos");
        votosNulos=sc.nextDouble();

        System.out.println("digite o total de votos validos");
        votosValidos=sc.nextDouble();

        percentualBrancos=votosBrancos*100/totalEleitores;
        percentualNulos=votosNulos*100/totalEleitores;
        percentualValidos=votosNulos*100/totalEleitores;

        System.out.printf("""
          =========== total de %f votos===========|
          |  votos Brancos=%f%%                   |
          |  votos Nulos=%f%%                     |           
          |  votos Validos=%f%%                   |
          ========================================= 
            """,totalEleitores,percentualBrancos,percentualNulos,percentualValidos);
        sc.close();


    }
}



