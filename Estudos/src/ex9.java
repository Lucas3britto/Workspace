/*
Dado os 3 lados de um triângulo verificar se FORMA
OU NÃO um TRIÂNGULO e imprimir sua classificação.
 Para formar um triângulo
 Os lados de um triângulo devem ser maiores que zero
 Cada Lado deve ser menor que a soma dos outros dois
 Imprimir a classificação do triângulo
 Equilátero – 3 lados iguais
 Escaleno – 3 lados diferentes
 Isósceles – 2 lados iguais e 1 diferente
 */

import java.util.Scanner;

public class ex9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;

        System.out.println("Informe um número inteiro: ");
        a = sc.nextInt();
        System.out.println("Informe um número inteiro: ");
        b = sc.nextInt();
        System.out.println("Informe um número inteiro: ");
        c = sc.nextInt();
        if (a > 0 || b > 0 || c > 0) {
            if (a + b > c || a + c > b || b + c > a) {
                if (a == b || b == c) {
                    System.out.println("Equilátero");
                } else if (a == b || a == c || b == c) {
                    System.out.println("Isóceles");
                } else {
                    System.out.println("Escaleno");
                }
            }
        }
    }
}