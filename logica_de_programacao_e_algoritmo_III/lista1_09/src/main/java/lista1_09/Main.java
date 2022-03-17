/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1_09;
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
         * Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um mês.
         * Considere fixo o juro da poupança em 0,07% a.m;
         */
        
        float deposito;
        // Tentei criar a constante como float mas deu erro
        double saldo;
        final double JUROSMES = 0.07;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o valor do depósito: ");
        deposito = ler.nextFloat();
        
        saldo = deposito + (deposito * JUROSMES);
        System.out.printf("O saldo para essa conta é: %.2f", saldo);   
        
    }
    
}
