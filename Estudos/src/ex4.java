/*
Ler dois valores inteiros e apresentar a diferença do maior
pelo menor. Suponha que não sejam iguais.
 */

import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;

        System.out.println("Digite dois valores inteiros, diferentes: ");
        a = sc.nextInt();
        b = sc.nextInt();

        if (a > b) {
            System.out.println("A diferença é de: " + (a - b));
        } else {
            System.out.println("A diferença é de: " + (b - a));
        }
    }
}