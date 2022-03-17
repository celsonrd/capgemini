/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1_11;
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
         * Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. 
         * Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário;
         */
        
        float custo, lucro, venda;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o valor de custo do produto: ");
        custo = ler.nextFloat();
        
        System.out.print("Digite o valor de custo do produto: ");
        lucro = ler.nextFloat();
        
        venda = custo + lucro;
        
        System.out.printf("O valor de venda será R$: %.2f", venda);
        
    }
    
}
