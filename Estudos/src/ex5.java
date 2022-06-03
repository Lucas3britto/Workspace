/*
 Faça um algoritmo que receba a idade de uma pessoa e
mostre se ela é maior de idade ou não
*/

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        
        System.out.println("Digite a sua idade: ");
        idade = sc.nextInt();
        
        if (idade>=18){
            System.out.println("Você é maior de idade");
    }else {
            System.out.println("Você é menor de idade");
        }
    }
}
