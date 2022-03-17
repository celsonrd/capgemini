/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1_10;
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
         * A Loja Mamão com Açúcar está vendendo seus produtos em 5(cinco) prestações sem juros. 
         * Faça um algoritmo que receba um valor de uma compra e mostre o valor das prestações;
         */
        
        float valorCompra, valorPrestacao;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o valor da compra: ");
        valorCompra = ler.nextFloat();
        
        valorPrestacao = valorCompra / 5;
        
        System.out.printf("Cada prestação vai custar: R$ %.2f", valorPrestacao);
        
    }
    
}
