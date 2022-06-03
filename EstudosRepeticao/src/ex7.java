/*
Construir um algoritmo que leia um
número inteiro e imprimir a sequência: 1,2, 4, 8, 16, 32,... enquanto o valor for
menor ou igual ao valor lido.
– Exemplo:
– Valor lido: 82
– Sequência impressa: 1, 2, 4, 8, 16, 32, 64
 */

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        int a;
        int valor;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número inteiro: ");
        valor = sc.nextInt();
        
        for (a=1; a<=valor; a*=2){
        System.out.printf("%d, ",a);
    }
    }
}
