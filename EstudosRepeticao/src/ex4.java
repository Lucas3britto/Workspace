/*
 Faça um algoritmo que leia 200 números inteiros e imprima
quantos são pares e quantos são ímpares.
 */

public class ex4 {

    public static void main(String[] args) {
        int a = 0;
        int contPar = 0;
        int contImpar = 0;

        while (a <= 200) {
            a++;
            if (a % 2 == 0) {
                contPar = contPar + 1;
                if (contPar > 99) {
                    System.out.println("Numeros pares é igual a: " + contPar);
                } else {
                    contImpar = contImpar++;
                    if (contImpar>=101){
                    System.out.println("Numeros ímpares é igual a: " + contImpar);
                    }
                }
            }
        }
    }
}
