/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1p1_diegonunez;

import static ex1p1_diegonunez.Ex1P1_DiegoNunez.WordReplace;
import java.security.SecureRandom;
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
                System.out.println("Ingrese una cadena de texto:");
                String cadena = entrada.next();
                Vecinos(cadena);
            } else if (ejercicio == 3) {
                int x = entrada.nextInt();
                Triforce(x);
            } else if (ejercicio == 4) {
                System.out.println("ingrese cadena 1");
                String cadena1 = entrada.next();
                System.out.println("Ingrese cadena 2");
                String cadena2 = entrada.next();
                Anagram(cadena1, cadena2);
            }
        } while (1 < 0);

    }

    public static String WordReplace(String cadena, String search, String replace) {
        int cont = 0;
        String acum = "";
        if (cadena.contains(search)) {
            for (int i = 0; i < cadena.length()-1; i++) {
                if (cadena.charAt(i)==(search.charAt(cont))) {
                    cont++;
                    boolean real = true;
                    if (cont == search.length()-1) {
                    acum = acum + replace;
                    break;
                } else {
                        acum = acum + cadena.charAt(i);
                    }
                } else {
                    cont = 0;
                    acum = acum+ cadena.charAt(i);
                }
                    
                
                
                
            }

        } else {
            System.out.println("La cadena no contiene la palabra" + search);
        }
      System.out.println(acum);
        return (replace);
    }

    public static String Vecinos(String cadena) {

        SecureRandom random = new SecureRandom();
        int base = 25;
        String cadenan = "";
        int r = random.nextInt(2);
        if (r == 0) {
            for (int i = 0; i < cadena.length(); i++) {
                int num = (int) cadena.charAt(i);
                int nnum = num - 1;
                if (nnum == 96) {
                    nnum = 122;

                }

                cadenan = cadenan + (char) nnum;

            }

        } else {
            for (int i = 0; i < cadena.length(); i++) {
                int num = (int) cadena.charAt(i);
                int nnum = num + 1;
                if (nnum == 123) {
                    nnum = 97;
                }
                cadenan = cadenan + (char) nnum;

            }
        }
        System.out.println("Numero resultado:" + r);
        System.out.println("Cadena resultante: " + cadenan);
        int name = 97 - 122;

        return (cadena);
    }

    public static int Triforce(int x) {
        int cont = 0;
        int cont2 = 0;
        if (x % 2 == 1) {
            for (int i = 0; i < x; i++) {

                while (cont2 <= x) {
                    System.out.print(" ");
                    cont2++;
                }
                System.out.print("*");
                System.out.println(" ");
                cont = cont + 1;
            }
        }
        return (x);
    }

    public static boolean Anagram(String cadena1, String cadena2) {
        boolean anagrama = false;
        int acum1 = 0;
        int acum2 = 0;
        String acum = "";
        if (cadena1.length() == cadena2.length()) {
            for (int i = 0; i < cadena1.length(); i++) {
                acum1 = acum1 + (char) cadena1.charAt(i);
                acum2 = acum2 + (char) cadena2.charAt(i);

            }
            if (acum1 == acum2) {
                System.out.println("Es un anagrama.");
            } else {
                System.out.println("No es un anagrama");
            }
        } else if (cadena1.length() != cadena2.length()) {
            System.out.print("no es un anagrama ni es del mismo tamano.");
        }
        return (anagrama);
    }

}
