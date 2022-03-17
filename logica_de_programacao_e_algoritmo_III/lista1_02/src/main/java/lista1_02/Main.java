/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1_02;

import java.util.Scanner;
/**
 *
 * @author celsonrd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Faça um algoritmo que receba dois números e ao final mostre a soma, 
         * subtração, multiplicação e a divisão dos dois números lidos;
         */
        
        int a, b;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o valor de A: ");
        a = ler.nextInt();
        
        System.out.println("Digite o valor de B: ");
        b = ler.nextInt();
        
        
        
        System.out.printf("A soma é: %d", a+b);
        System.out.printf("\nA subtração é: %d", a-b);
        System.out.printf("\nA multiplicação é: %d", a*b);
        System.out.printf("\nA divisão é: %d", a/b);
        
    }
    
}
