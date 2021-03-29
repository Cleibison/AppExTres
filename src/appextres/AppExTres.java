/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appextres;

import java.util.Scanner;



/**
 *
 * @author user
 */
public class AppExTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* . Faça um programa que receba um número real, calcule e imprima:
             a. A parte inteira do número;
             b. A parte fracionária do número;
             c. Arredondamento do número.*/
        // // entrada na forma de duplo
       
        float num;
        float frac;
        int arren;
        Scanner leia = new Scanner(System.in);
        num = leia.nextInt();
        
        System.out.println("Parte fracionária");
        frac = num/10;
        System.out.println(frac);
        
        System.out.println("arredondamento");
        arren = (int) Math.ceil(frac);
        
        System.out.println(arren);
        
    }
    
}
