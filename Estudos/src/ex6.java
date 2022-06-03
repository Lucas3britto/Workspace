/*
Ler um número inteiro e apresentar uma mensagem
informando se o número é par ou ímpar. (usar o operador módulo (%) )
 */

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        
        System.out.println("Digite um número inteiro: ");
        a = sc.nextInt();
        
        if (a%2==0){
            System.out.println("Seu número é par!");
        }else {
            System.out.println("Seu número é ímpar!");
        }
    }
}
