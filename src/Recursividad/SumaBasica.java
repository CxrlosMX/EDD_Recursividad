/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad;

import java.util.Scanner;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 14/05/2021
 *
 */
public class SumaBasica {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce a");
        int a = sc.nextInt();
        System.out.println("Introduce b");
        int b = sc.nextInt();
        int suma = suma(a, b);
        System.out.println("Suma=" + a + "+" + b + "=" + suma);
    }

    public static int suma(int a, int b) {
        if (a == 0) {
            return b;
        } else {
            if (b == 0) {
                return a;
            } else {
                return 1 + suma(a-1, b );
            }

        }

    }

}
