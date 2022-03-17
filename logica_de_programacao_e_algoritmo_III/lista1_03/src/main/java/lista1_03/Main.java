/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1_03;
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
         * Escreva um algoritmo para determinar o consumo médio de um automóvel 
         *  sendo fornecida a distância total percorrida pelo automóvel e o 
         * total de combustível gasto;
         */
        
        float totalDistancia, totalCombustivel;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite a distancia total percorrida: [em kilometros]");
        totalDistancia = ler.nextFloat();
        System.out.println("Digite total de combusível gasto: [em litros] ");
        totalCombustivel = ler.nextFloat();
        
        System.out.printf("O consumo médio desse automóvel é de %.2f ", totalDistancia/totalCombustivel);

        
    }
    
}
