/*
Ler o salário de uma pessoa e calcular e
imprimir o desconto do INSS de acordocom a tabela a seguir:
<= R$ 600,00 Isento
> R$ 600,00 e <= R$ 1200 20%
> R$ 1200,00 e <= R$ 2000,00 25%
> R$ 2000,00 30%
 */

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float salario, desconto;
        
        System.out.println("Digite o seu salário: ");
        salario = sc.nextFloat();
        
         if (salario > 600 && salario <= 1200){
            desconto = salario*0.2F;           
        System.out.println("Seu salário com desconto é de: " +(desconto+salario));
        } if (salario >1200 && salario <= 2000){
            desconto = salario*0.25F;
        System.out.println("Seu salário com desconto é de: " +(desconto+salario));
        } if (salario > 2000){
            desconto = salario*0.3F;
        System.out.println("Seu salário com desconto é de: " +(desconto+salario));
        } else {
            System.out.printf("Isento de desconto");
        }
    }
}
