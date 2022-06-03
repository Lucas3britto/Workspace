import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0;
        
        System.out.printf("Digite um número: ");
        a = sc.nextInt();
        
        if (a>20){
            System.out.printf("Seu número é: %.2f", a/2d);
        }else {
            System.out.println("Seu número é: " +a);
        }
    }
}
