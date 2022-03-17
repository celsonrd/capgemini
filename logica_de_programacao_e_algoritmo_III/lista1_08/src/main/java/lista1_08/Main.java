/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1_08;
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
         * Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em dólar (US$). 
         * O algoritmo deverá solicitar o valor da cotação do dólar e também aquantidade de dólares disponíveis com ousuário;
         */
        
        float real, dolar, cotacao;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite um valor em Dolar $: ");
        dolar = ler.nextFloat();
        System.out.print("Digite o valor da cotação atual em Real R$: ");
        cotacao = ler.nextFloat();
        real = dolar*cotacao;
        System.out.printf("O valor convertido em Real é R$ %.2f", real);
        
        
        
        
        
        
    }
    
}
