package html;

import java.util.Scanner;

public class exercici1 {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Demanem la quantitat de casos a evaluar.
        int casos = scan.nextInt();

        // Declarem variables per fer calculs i de control.
        int diesEclipsiTotal = 548;
        int diesEclipsiParcial = 183;
        int contador = 0;


        // Fem un bucle amb la quantitat de casos a evaluar per demanar les dades al
        // usuari.
        while (contador < casos) {
            int dies = scan.nextInt();

            // Fem una viarable per comptar els dies restants per el proper eclipsi total o
            // parcial.
            int diesRestants = 0;

            // Comprovem si es un eclipsi total, parcial o res i imprimim el resultat.
            if (dies % diesEclipsiTotal == 0) {
                System.out.println("TOTAL " + diesRestants);
            
            } else if (dies % diesEclipsiParcial == 0) {
                System.out.println("PARCIAL " + diesRestants);
            } else {

                // En cas de no ser ni eclipsi parcial ni total, calculem quants dies faltan per
                // al proper eclipsi i quin tipus de eclipsi sera(total o parcial)
                if ((diesEclipsiTotal - dies % diesEclipsiTotal) < (diesEclipsiParcial - dies % diesEclipsiParcial)) {
                    diesRestants = diesEclipsiTotal - (dies % diesEclipsiTotal);
                    System.out.println("NO " + diesRestants+" TOTAL");
                } else {
                    diesRestants = diesEclipsiParcial - (dies % diesEclipsiParcial);
                    System.out.println("NO " + diesRestants+" PARCIAL");

                }
            }
            contador++;
        }
        scan.close();

    }
}
