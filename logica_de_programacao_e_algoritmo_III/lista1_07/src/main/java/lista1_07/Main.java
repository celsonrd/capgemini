/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1_07;
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
         * Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. 
         * Afórmula de conversão é:F=(9*C+160) / 5, 
         * sendo F a temperatura em Fahrenheit e C a temperatura em Celsius;
         */
        float celsius, fahrenheit;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite uma temperatura em Celsius: ");
        celsius = ler.nextFloat();
        fahrenheit = (9 * celsius + 160) / 5;
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
        
        
        
        
    }
    
}
