package faccatJaison;

import javax.swing.*;

public class Ex05IG {
    JFrame quadroAviso;

    Ex05IG(){
        quadroAviso = new JFrame();
        JOptionPane.showMessageDialog(quadroAviso, "programa Antecessor");
         String numero = JOptionPane.showInputDialog(quadroAviso, "digite um numero para descobrir seu antesessor");
         int valor = Integer.parseInt(numero);
         int antecessor = valor -1;
         JOptionPane.showMessageDialog(quadroAviso, "o valor antecessor do numero digitado é:" + antecessor);
    }
    public static void main(String[] args) {
        new Ex05IG();
    }
}

