/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1_14;
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
         *  Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior;
         */
        
        int a, b;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o valor A");
        a = ler.nextInt();
        
        System.out.println("Digite o valor B");
        b = ler.nextInt();
        
        if(a > b){
            System.out.printf("%d é o valor maior", a);
        } else if (b > a){
            System.out.printf("%d é o valor maior", b);
        }
        
        
    }
    
}
