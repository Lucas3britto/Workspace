public class Resposta implements java.io.Serializable {
    private int status;
    private float result;

    public Resposta(int status, float result) {
        this.status = status;
        thi.result = result;
    }

    public Resposta(){
        //nao faz nada
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int newStatus) {
        status = newStatus;
    }
    public float getResult() {
        return result;
    }
    public void setResult(float newResult) {
        this.result = newResult;
    }

}
