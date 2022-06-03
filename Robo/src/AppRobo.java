import java.util.Scanner;

public class AppRobo {

    public static void main(String[] args) {
        Robo robo = new Robo(); //Instanciar a classe Robo
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a direção do robô");
        char direcao = teclado.nextLine().charAt(0);
        robo.setDirecao(direcao);
        robo.mostrarPosicaoAtual();

        teclado.close();
    }

}