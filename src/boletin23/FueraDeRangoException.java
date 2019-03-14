/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin23;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author slorenzorodriguez
 */
public class FueraDeRangoException {
    
    public static Scanner scanner() {
        return new Scanner(System.in);
    }

    public static Random random() {
        return new Random();
    }

    public static int randomInt(int bound) {
        return random().nextInt(bound);
    }

    public static int randomInt() {
        return random().nextInt();
    }


    public static int[] randomIntsArray(int elements, int lowBound, int highBound) {
        int range = highBound - lowBound + 1;
        int[] randoms = new int[elements];
        for (int i = 0; i < randoms.length; i++) {
            randoms[i] = randomInt(range) + lowBound;
        }
        return randoms;
    }

    public static int[] randomIntsArray(int elements, int highBound) {
        return randomIntsArray(elements, 0, highBound);
    }

    public static int[] randomIntsArray(int elements) {
        return randomIntsArray(elements, elements);
    }

    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static int pedirPersonas() {
        String personas;
        do {
            System.out.print("Cuantas personas? ");
            personas = scanner().next();
        } while (!isInteger(personas));
        int p = Integer.parseInt(personas);
        if (p > 50 || p < 0)
           
        return p;
        return 0;
    }

    FueraDeRangoException(String numero_de_personas_fuera_de_rango) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


