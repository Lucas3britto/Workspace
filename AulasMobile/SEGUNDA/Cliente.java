import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import javax.sound.sampled.Port;

public class cliente {

    static Conexao c;
    static Socket socket;

    puclic Cliente() {
        try {
            socket = new Socket("localhost", 9600);
        } catch (IOException e) {
            System.err.println("Não consegui resolver o host...");
        }
    }

    public static void main (String[] args) throws IOException{
            try{
                new Cliente();
                float op1, op2;
                char oper;
                Scanner in = new Scanner(Systen.in);

                System.out.println("***************************");
                System.out.println("**CALCULADORA DISTRIBUIDA**");
                System.out.println("***************************");

                System.out.println("Digite o primeiro número: ");
                op1 = in.nextFloat();
                System.out.println("Digite o segundo número: ");
                op2 = in.nextFloat()
                System.out.println("Escolha uma operação: ");
                oper = in.next().charAt (0);

                Requisicao magReq = new Requisicao(op1, op2, oper);
                e.send(Socket, msqReq);
                Resposta msgReq = (Resposta) c.receive(socket);

                switch (msgReq.getStatus()) {
                    case 0;
                        System.out.println("Resultado = "+msgReq.getResult());
                        break;
                    case 1;
                        System.out.println("Operação não implementada");
                        break;
                
                    default;
                    System.out.println("Divisão por zero");
                        break;
                }
            } catch (Exception e){
                System.out.println("Problemas ao fechar socket");
            }
            finally{
                socket.close();
            }
        }
}