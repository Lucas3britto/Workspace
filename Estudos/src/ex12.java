/*
  Faça um algoritmo que receba a idade de um
nadador e imprima a sua categoria seguindo as
regras:
Categoria Idade
Infantil A 5 - 7 anos
Infantil B 8 - 10 anos
Juvenil A 11- 13 anos
Juvenil B 14- 17 anos
Sênior maiores de 18 anos
 */

import java.util.Scanner;

public class ex12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade = 0;

        System.out.println("Digite a sua idade para saber sua categoria: ");
        idade = sc.nextInt();

        if (idade >= 5 && idade <= 7) {
            System.out.println("A sua categoria é: Infantil A");
        }
        if (idade >= 8 && idade <= 10) {
            System.out.println("A sua categoria é: Infantil B");
        }
        if (idade >= 11 && idade <= 13) {
            System.out.println("A sua categoria é: Juvenil A");
        }
        if (idade >= 14 && idade <= 17) {
            System.out.println("A sua categoria é: Juvenil B");
        } else if (idade >= 18) {
            System.out.println("A sua categoria é: Sênior");
        } else {
            System.out.println("A idade não se enquadra nas categorias!!");
        }
    }
}
