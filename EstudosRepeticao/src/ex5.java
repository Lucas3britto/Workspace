/*
Faça um algoritmo que leia dez números inteiros e imprima
o maior número da lista.
 */

import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = 0;
        int[] cont = new int[10];

        System.out.println("O algoritmo vai ler 10 numeros e dizer qual é o maior!");
        
        for (int i=0; i<10; i++){
        System.out.println("Informe o "+ (i+1) +"º valor e aperte enter!");
        cont [i] = sc.nextInt();
        maior = cont [i];
        if (i>10){
            System.out.println("Número inválido!");
        } 
        }
        for (int i=0; i<10; i++){
            if (cont [i] > maior){
                maior = cont[i];
            }
        }
        System.out.println("O maior número é: "+maior);
}
}