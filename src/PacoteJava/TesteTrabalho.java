package PacoteJava;

public class TesteTrabalho {

    public static double multiplicaValor(double x, double y){
        return (x * y);
    }

    public static void somarValor(){
        double x, y, resposta;
        x = 10.5;
        y = 10.5;
        resposta = x+y;
        System.out.println("Somar Valor = "+resposta);
    }

    public static void mutiplicandoValor(double x,double y){

        double resposta = (x * y);

        System.out.println("Somando valor = "+resposta);
    }
    public static String imprimeTexto(String texto){
        return texto;
    }

    public static void imprimirTexto(String texto){
        System.out.println("Texto impresso = "+texto);
    }
}
