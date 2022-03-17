/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1_04;
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
         * Escreva um algoritmo que leia o nome de um vendedor, 
         * o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). 
         * Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, 
         * informar o seu nome, o salário fixo e salário no final do mês;
         */
        
        String nome;
        float salarioFixo, vendas;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o nome do vendedor: ");
        nome = ler.next();
        System.out.print("Digite o salário fixo: ");
        salarioFixo = ler.nextFloat();
        System.out.print("Digite o valor total de vendas realizada: ");
        vendas = ler.nextFloat();
        
        System.out.printf("#################################\n");
        System.out.printf("#######    RELATÓRIO    #########\n");
        System.out.printf("#################################\n");
        System.out.printf("# Nome do vendedor: %s \t#\n", nome);
        System.out.printf("# Salário fixo %.2f \t\t#\n", salarioFixo);
        System.out.printf("# Salário com comissão: %.2f \t#\n", salarioFixo+(vendas*0.15));
        System.out.printf("#################################\n");
        
        
        
    }
    
}

