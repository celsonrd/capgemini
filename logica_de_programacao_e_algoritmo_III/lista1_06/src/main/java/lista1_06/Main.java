/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1_06;
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
         * Leia dois valores para as variáveis A e B, e efetuar as trocas dos 
         * valores de forma que a variável A passe a possuir o valor da variável 
         * B e a variável B passe a possuir o valor da variável A.
         * Apresentar osvalores trocados;
         */
        
        String a, b, aux;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o valor A: ");
        a = ler.next();
        System.out.print("Digite o valor B: ");
        b = ler.next();
        
        System.out.println("O valor digitado de A foi: " + a);
        System.out.println("O valor digitado de B foi: " + b);
        
        aux = a;
        a = b;
        b = aux;
        
        System.out.println("O valor de A é: " + a);
        System.out.println("O valor de B é: " + b);
        
        
        
        
        
        
    }
    
}
