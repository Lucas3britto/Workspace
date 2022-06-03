/*Faça um algoritmo para ler um número inteiro e imprimir o
seu valor caso esteja no intervalo entre 50 e 100 (inclusive).
*/

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;

        System.out.printf("Digite um número: ");
        a = sc.nextInt();
        if (a>=50 && a<=100){
            System.out.println(a);
        } else {
            System.out.printf("Não esta dentro do valor desejado!!");
        }
    }

}
