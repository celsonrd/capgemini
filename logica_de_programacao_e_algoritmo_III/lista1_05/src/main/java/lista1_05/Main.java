/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1_05;
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
         * Escreva um algoritmo que leia o nome de um aluno e as notas das três
         * provas que ele obteve no semestre. 
         * No finalinformar o nome do aluno e a sua média (aritmética);
         */
        
        String nome;
        int nota1, nota2, nota3;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o nome do aluno: ");
        nome = ler.next();
        System.out.print("Digite a nota 1: ");
        nota1 = ler.nextInt();
        System.out.print("Digite a nota 2: ");
        nota2 = ler.nextInt();
        System.out.print("Digite a nota 3: ");
        nota3 = ler.nextInt();
        
        System.out.printf("A média do aluno %s foi %d", nome, (nota1+nota2+nota3)/3);
        
        
        
    }
    
}
