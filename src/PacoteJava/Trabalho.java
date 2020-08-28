package PacoteJava;

import javax.swing.*;

public class Trabalho {

    public static void main(String[] args) {
        double x, y, resultado;
        String aux = "";

        aux = JOptionPane.showInputDialog(null, "Digite o primeiro número:");
        x = Double.parseDouble(aux);

        aux = JOptionPane.showInputDialog(null, "Digite o segundo número:");
        y = Double.parseDouble(aux);

        resultado = TesteTrabalho.multiplicaValor(x, y);

        JOptionPane.showMessageDialog(null, "A multiplicação é = " + resultado);
    }

}
