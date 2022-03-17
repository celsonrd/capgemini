/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1_15;
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
         * Faça um algoritmo que receba um número e diga se este número está no 
         * intervalo entre 100 e 200;
         */
        
        int valor;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um valor");
        valor = ler.nextInt();
        
        if (valor >= 100 && valor <= 200) {
            System.out.println("Valor no intervalo de 100 e 200");
        } else {
            System.out.println("Valor fora do intervalo de 100 e 200");
        }
        
    }
    
}
