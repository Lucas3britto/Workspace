/*
Faça um algoritmo que imprima a
tabuada do número 5.
 */
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Tabuada do 5!");
        System.out.println("Digite um número de 1 a 10 para saber o resultado: ");
        a = sc.nextInt();
        if (a>=1 && a<=10) {
            System.out.println("O resultado é: "+a*5);
        }else {
            System.out.println("Valor fora do intervalo!");
        }
    }
}
