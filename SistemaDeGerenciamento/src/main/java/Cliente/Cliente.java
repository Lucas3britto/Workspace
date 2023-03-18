package Cliente;

public class Cliente {

    private String nome;
    private String sexo;
    private String data;
    private String altura;
    private String peso;

    public Cliente(String nome, String sexo, String data, String altura, String peso) {
        this.nome = nome;
        this.sexo = sexo;
        this.data = data;
        this.altura = altura;
        this.peso = peso;
    }

    public Cliente() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

}
