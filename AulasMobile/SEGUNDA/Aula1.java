import java.io.Serializable;
public class Aula1 implements Serializable {
    public static void main (String[] args) {
        private float op1;
        private float op2;
        private char operacao;

        public Requisicao (float op1, float op2, char operacao)
        this.op1 = op1;
        this.op2 = op2;
        this.operacao = operacao;
            
    public float getOp1() {
        return op1;
    }
    public void setOp1(float op1) {
        this.op1 = op1;
    }
    public float getOp2() {
        return op2;
    }
    public void setOp2(float op2) {
        this.op2 = op2;
    }
    public char getOperacao() {
        return operacao;
    }
    public void setOperacao(char operacao) {
        this.operacao = operacao;
    }

}