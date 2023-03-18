import java.net.ConnectException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.lang.model.util.ElementScanner6;
import javax.xml.catalog.Catalog;

public class Servidor {
    
    static ServerSocket serversocket;
    static Socket client_Socket;
    static Conexao c;

    public Servidor (){
        try{
            serversocket = new ServerSocket(9600);
            System.out.println("Calculadora distribuida ta no ar!!");
            System.out.println("Aguardando cliente fazer requisição...");            
        }
        catch (Exception e){
            System.out.println("Não criei o server socket...");
        }
    }
    public static void main (Sting args[]){
        Requisicao msgReq;
        Resposta msgRep;
        int visits = 0;
        new Servidor();

        while (true){
            if (Connect()){
                msgReq = (requisicao) c.receive(client_Socket);
                
                char op = msgReq.getOperacao();
                System.out.println("Operação "+ op);
                msgRep = new Resposta();

                switch (op){
                    case '+':
                    msgRep.setStatus(0);
                    msgReq.setResult(msgReq.getOp1() + msgReq.getOp2);
                    break;

                    case '-':
                    msgRep.setStatus(0);
                    msgReq.setResult(msgReq.getOp1() - msgReq.getOp2);
                    break;

                    case '*':
                    msgRep.setStatus(0);
                    msgReq.setResult(msgReq.getOp1() * msgReq.getOp2);
                    break;

                    case '/':
                    if (msgReq.getOp2() == 0.0F){
                        msgRep.setStatus(2);
                    }   else{
                        msgRep.setStatus(0);
                        msgRep.setResult(msgReq.getOp1() / msgReq.getOp2());
                    }
                    break;
                    default;
                    msgRep.setStatus(1);
                    break;
                    
                }
                    Conexao.send(client_Socket, msgRep);
                    
            } else {
                try{
                    serversocket.close();
                    break;
                } 
            }d
        }
    }
}
