/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author reroes
 */
public class Problema05 {

    public static void main(String[] args) {

        ////////VARIABLES///////////////
        
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
                                  {"Carrie Burton", "Lauren Rice"},
                                  {"Emma Escobar", "Lori Flores"},
                                  {"Steven West", "Toni Martin"}};

        char[][] in = new char[4][2];
        String[][] in2 = new String[4][2];
        String mensaje = "";

        /////////CICLO//////////////////
        
        for (int f = 0; f < estudiantes.length; f++) {
            for (int c = 0; c < estudiantes[f].length; c++) {

                in[f][c] = estudiantes[f][c].charAt(0);
                in2[f][c] = String.valueOf(in[f][c]);

            }
        }
        for (int f = 0; f < estudiantes.length; f++) {
            for (int c = 0; c < estudiantes[f].length; c++) {

                if (in2[f][c].equals("S")
                        || in2[f][c].equals("P")
                        || in2[f][c].equals("T")) {

                    mensaje = String.format("%s%s ㋡\n", mensaje,
                            estudiantes[f][c]);

                }
            }
        }
        System.out.println(mensaje);
    }

}
