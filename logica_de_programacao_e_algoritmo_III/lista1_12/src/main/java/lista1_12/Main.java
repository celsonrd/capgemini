/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1_12;
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
         * O custo de um carro novo ao consumidor é a soma do custo de fábrica 
         * mais o percentual do distribuidor e dos impostos aplicados 
         * (primeiro os impostos são aplicados sobre o custo de fábrica, 
         * e depois o percentual do distribuidor sobre o resultado). 
         * Supondo que o percentual do distribuidor seja de 28% e os impostos 45%, 
         * escreva um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do mesmo;
         */
        
        double custoFabricacao, custoFinal;
        final double PERCENTUALDISTRIBUIDOR = 0.28;
        final double PERCENTUALIMPOSTO = 0.45;
        
        Scanner ler = new Scanner(System.in);
                
        System.out.print("Digite o valor de custo de fabricação R$: ");
        custoFabricacao = ler.nextFloat();
        
        custoFinal = custoFabricacao + (custoFabricacao * PERCENTUALDISTRIBUIDOR);
        custoFinal = custoFinal + (custoFinal * PERCENTUALIMPOSTO);
        
        System.out.printf("O custo final desse veículo é de R$ %.2f ", custoFinal);
        
        
                
        
        
    }
    
}
