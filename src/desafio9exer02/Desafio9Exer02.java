/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio9exer02;

import java.util.Scanner;

/**
 *
 * @author odavi
 */
public class Desafio9Exer02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int numeros, cNumeros;
        cNumeros = 0;
        System.out.println("Digite um número de sua escolha:");
        numeros = teclado.nextInt();
        do{
            if(numeros < 0){
                cNumeros = cNumeros + numeros;
            }
        System.out.println("Digite um número de sua escolha:");
        numeros = teclado.nextInt();
        }while(numeros != 0);
        System.out.println("A soma dos números negativos é de: "+cNumeros);
    }
    
}
