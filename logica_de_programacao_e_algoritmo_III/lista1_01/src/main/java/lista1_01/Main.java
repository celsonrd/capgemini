/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1_01;
import java.util.Scanner;

/**
 *
 * @author crd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Faça um algoritmo que receba dois números e exiba o resultado da sua soma;
         */
        
        int numero;
        Scanner ler = new Scanner(System.in);
     
        
        System.out.println("Digite o primeiro valor: ");
        numero = ler.nextInt();
        
        System.out.println("Digite o segundo valor: ");
        numero += ler.nextInt();
        
        System.out.println("A soma é: " + numero);
         
        
    }
    
}
