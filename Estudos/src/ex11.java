/*
 Faça um algoritmo para realizar as operações
matemáticas de soma, subtração, divisão,multiplicação e resto.
 O algoritmo deve ler dois números e o sinal
correspondente à operação desejada (usar char), no
final deve ser impresso o resultado.
 Restrições:
 Se o sinal digitado não corresponder a uma operação
apresentar mensagem “Sinal Inválido” e finalizar
 Para as operações de divisão e resto da divisão verificar se
o divisor é válido (maior que zero)!
 */

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
      char op;
      
      do{
        System.out.println("=== Calculadora ===");
        System.out.println("[+] - Soma");
        System.out.println("[-] - Subtração");
        System.out.println("[*] - Multiplicação");
        System.out.println("[/] - Divisão");
        System.out.println("[s] - Sair");
        System.out.println("== Escolha a função desejada ==");
        
        op=teclado.nextLine().toLowerCase().charAt(0);
        float a,b,c;
        switch(op){
            
            case '+':
                System.out.println("Digite dois numeros");
                a=teclado.nextFloat();
                b=teclado.nextFloat();
                c=a+b;
                System.out.println("Resultado: "+c);
                break;
                
            case '-':
                System.out.println("Digite dois numeros");
                a=teclado.nextFloat();
                b=teclado.nextFloat();
                c=a-b;
                System.out.println("Resultado: "+c);
                break;
            
            case '*':
                System.out.println("Digite dois numeros");
                a=teclado.nextFloat();
                b=teclado.nextFloat();
                c=a*b;
                System.out.println("Resultado: "+c);
                break;  
                
            case '/':
                System.out.println("Digite dois numeros");
                a=teclado.nextFloat();
                b=teclado.nextFloat();
                if(b==0){
                    System.out.println("Divisão por zero!");
                }else{
                   c=a/b;
                   System.out.println("Resultado: "+c);
                }
                break;
                
            case 's': 
                teclado.close();
                System.out.println("Calculadora encerrada!");
                System.exit(0);
                break;
                
            default:
                System.out.println("OPERAÇÃO INVÁLIDA");
                break; 
        }
        teclado.nextLine();
      }while(op!='s');
    }
    
}