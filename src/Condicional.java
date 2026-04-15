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
class SwitchCase {
    public static void main(String[] args) {
        int dia = 3;
        String diasSemana;

        switch (dia) {
            case 1:
                diasSemana = "domingo";
                break;
            case 2:
                diasSemana = "segunda-feira";
                break;
            case 3:
                diasSemana = "terca-feira";
                break;
            default:
                diasSemana = "dia invalido";
        }

        System.out.println(diasSemana);
    }
}
// Aprendi que meu switch case deu erro po falta de {} e tbm pq nao respeitei os metedos corretos dentro do Java