import javax.swing.*;

public class Condicional {
   public static void main (String[] args) {
       int anoDeLancamento = 2022;
            boolean incluidoNoPlano =false;
                double notaDoFilme  =8.1;
                String tipoPlano = "normal";

                if (anoDeLancamento >= 2022) {
                    System.out.println("Lacamento que o Publico curtiu");

          }         else {
                    System.out.println("O filme retro tbm vale a pena " );

                }
                if (incluidoNoPlano == true && tipoPlano .equals("plus")) {
           System.out.println("filme liberado");
       }
            else {
           System.out.println("voce deve pagar a locacao do filme ");
       }

   }
}