/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.switchcase;

import java.util.Scanner;
/**
 *
 * @author aluno
 */
public class SwitchCase {

    public static void main(String[] args) {
       double numero1, numero2, resultado=0;
       char operacao;
       Scanner input = new Scanner(System.in);
       System.out.println( "Informe o primeiro número");
       numero1 = input.nextDouble();
       System.out.println( "Informe o segundo número");
       numero2 = input.nextDouble();
       System.out.println("::::::::: Menu da Calculadora");
       System.out.println("[+] somar\n"+
                          "[-] subtrair\n"+
                          "[*] multiplicar\n"+
                          "[/] dividir\n"+
                          "[%] resto da divisão\n");
       
      System.out.println("Escolha uma opção");
       operacao = input.next().charAt(0);
       switch(operacao){
           case '+':
               resultado = numero1 + numero2;
               break;
           case '-':
               resultado = numero1 - numero2;
               break;
           case '*':
               resultado = numero1 * numero2;
               break;
           case '/':
               if(numero2 !=0){
               resultado = numero1 / numero2;
               }
               else{
                   System.out.println("Divisão por zero");
               }
               break;
           case '%':
               resultado = numero1 % numero2;
               break;
           default:
               System.out.println( "Opção Inválida");   
       }       
       System.out.printf("%.2f %s %.2f = %.2f ", numero1, operacao, numero2, resultado);
       
    }

    
}
