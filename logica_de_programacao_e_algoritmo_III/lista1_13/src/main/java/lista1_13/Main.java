/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1_13;
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
        
        int num;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite um valor: ");
        num = ler.nextInt();
        
        if (num > 10) {
            System.out.println("Número legal");
        } else {
            System.out.println("Que número chato :-( ");
        }
        
    }
    
}
