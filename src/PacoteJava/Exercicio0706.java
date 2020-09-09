package PacoteJava;

import javax.swing.*;

public class Exercicio0706 {

    public static void main(String[] args) {

        String msg = " ";

        msg = JOptionPane.showInputDialog(null, "Digite o salário: ");
        double x = Double.parseDouble(msg);

        double inss = x * 0.92;
        double inss2 = x * 0.91;
        double inss3 = x * 0.89;

        if (x<465.00){
            JOptionPane.showMessageDialog(null, "Salário invalido");
        }
        if ((x >= 465.00) && (x <= 965.67)) {
            JOptionPane.showMessageDialog(null, "Seu salário é R$" + x + ". A aliquota de INSS aplicada será de 8%. Será descontado do seu salário um valor de R$ " + (x - inss) + ". Com o desconto do INSS seu salário será de R$" + inss);
        } else if ((x >= 965.68) && (x <= 1609.45)) {
            JOptionPane.showMessageDialog(null, "Seu salário é R$ " + x + ". A aliquota de INSS aplicada será de 9%. Será descontado do seu salário um valor de R$" + (x - inss2) + ". Com o desconto do INSS seu salário será de R$" + inss2);
        } else if ((x >= 1609.46) && (x <= 3218.90)) {
            JOptionPane.showMessageDialog(null, "Seu salário é R$" + x + ". A aliquota de INSS aplicada será de 11%. Será descontado do seu salário um valor de R$" + (x - inss3) + "Com o desconto do INSS seu salário será de R$" + inss3);
        } else{
            JOptionPane.showMessageDialog(null, "Seu salário é R$" + x + ". Será descontado do seu salário um valor de R$ 354.07. Com o desconto do INSS seu salário será de R$" + (x - 354.07));
        }
    }
}
