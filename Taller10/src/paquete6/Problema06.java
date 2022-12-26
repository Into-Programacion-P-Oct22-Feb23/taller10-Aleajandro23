/*
Imprima en pantalla a través de una variable acumuladora solo los estudiantes 
que tengan 11 caracteres (se cuentan también los espacios en blanco)
 
 */
package paquete6;

/**
 *
 * @author reroes
 */
public class Problema06 {
    public static void main(String[] args) {
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
                                  {"Carrie Burton", "Lauren Rice"},
                                  {"Emma Escobar", "Lori Flores"},
                                  {"Steven West", "Toni Martin"}};
        
        int[][] caractere = new int[4][2];
        String mensaje = "";
        
        
        
        for(int fila = 0; fila < estudiantes.length; fila++){
            for(int columna = 0; columna < estudiantes[fila].length; columna++){
                caractere[fila][columna] = estudiantes[fila][columna].length(); 
            }
        }
        for(int fila = 0; fila < estudiantes.length; fila++){
            for(int columna = 0; columna < estudiantes[fila].length; columna++){
                if(caractere[fila][columna] == 11){
                    mensaje = String.format("%s%s\n", mensaje, 
                            estudiantes[fila][columna]);
                }
            }
        }
        System.out.println("Estos son los estudiantesツ:"+"\n"+ mensaje);
    }
}
