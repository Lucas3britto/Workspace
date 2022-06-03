/*
7. Faça um algoritmo que leia a altura e o sexo de uma
pessoa, calcule e mostre seu peso ideal. Sabendo que:
 Para homens: (72,7 * altura) – 58
 Para mulheres (62,1 * altura) – 44,7
 */

import java.util.Scanner;

public class ex7 {

    public static void main(String[] args) {

        char sexo;
        double altura, pesoIdeal;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a sua altura?");
        altura = sc.nextDouble();
        System.out.println("Qual o seu sexo?");
        sexo = sc.next().charAt(0);

        if (sexo == 'f' || sexo == 'F') {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            pesoIdeal = (72.7 * altura) - 58;
        }
        System.out.printf("Seu peso ideal é: %.2f", pesoIdeal);
    }
}
