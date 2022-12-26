/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        //***VARIABLE***
       int[][] datos = new int[2][2];
        ////////////////////////
        
        for (int f = 0; f < datos.length; f++) {

            for (int c = 0; c < datos[f].length; c++) {
                System.out.printf("Ingrse el valor de la fila [%d] "
                        + "columna [%d]:\n", f, c);
                datos[f][c] = entrada.nextInt();
            }

        }
        System.out.println("▔▔▔▔▔▔▔▔▔▔▔");
        System.out.println("El Arreglo:");
        for (int f = 0; f < datos.length; f++) {
            for (int c = 0; c < datos[f].length; c++) {
                System.out.printf("%d\t",
                        datos[f][c]);
            }
            System.out.println();
        }
    }

}
