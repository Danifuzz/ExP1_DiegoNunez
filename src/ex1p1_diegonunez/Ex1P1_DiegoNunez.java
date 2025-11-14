/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1p1_diegonunez;

import static ex1p1_diegonunez.Ex1P1_DiegoNunez.WordReplace;
import java.util.Scanner;

/**
 *
 * @author nunez
 */
public class Ex1P1_DiegoNunez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("Ingrese el ejrcicio a hacer: [1-4]");
            int ejercicio = entrada.nextInt();
            if (ejercicio == 1) {
                System.out.println("Ingrese la cadena:");

                String cadena = entrada.next();
                
                System.out.println("Ingrese la cadena a buscar:");
                
                String search = entrada.next();
                
                System.out.println("Ingrese la palabra a reemplazar:");
                
                String replace = entrada.next();
                WordReplace(cadena, search, replace);

            } else if (ejercicio == 2) {

            } else if (ejercicio == 3) {

            } else if (ejercicio == 4) {

            }
        } while (1 < 0);

    }

    public static String WordReplace(String cadena, String search, String replace) {
        int cont = 0;
        String acum = "";
        for (int i = 0; i < cadena.length()-1; i++) {

            if (cadena.charAt(i) == search.charAt(cont)) {
                int posicion = i;
                acum = acum + cadena.charAt(i);
                cont++;
                if (acum.equals(search)) {
                    for (int j = 0; j < cadena.length() - posicion; j++) {
                        System.out.print(cadena.charAt(j));
                    }
                    System.out.print(replace);

                }
            }
        }

 
        System.out.println(replace);

        return (replace);
    }
}
