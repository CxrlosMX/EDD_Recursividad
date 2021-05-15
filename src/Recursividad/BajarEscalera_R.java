/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author El Camaleon
 */
public class BajarEscalera_R {

    public static void main(String[] args) {
        //bajarEscalera(10);
        System.out.println("Suma= " + suma(5, 20));
    }

    //Creando nuestro metodo recursivo, para bajar una escalera
    public static void bajarEscalera(int n) {
        if (n < 0) {
            System.out.println("Introduce valores positivos por favor :|");
        } else if (n == 0) { //Caso base cuando ya conocemos la respuesta explicita
            System.out.println("Has terminado de bajar la escalera");
        } else {

            try {
                //Dominio, la division del problema original en (problema-1);
                Thread.sleep(500);
                System.out.println("Bajando escalon " + n);
                bajarEscalera(n - 1);//(problema-1);
                //Haciendo uso de la recursividad
            } catch (InterruptedException ex) {
                Logger.getLogger(BajarEscalera_R.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public static int suma(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            if (a == 0) {
                return b;
            } else {

                
                return 1+ suma(a-1, b );
            }
        }
    }

}
