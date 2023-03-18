package Funcionario;

public class Funcionario {

    private String nome;
    private String endereco;
    private String cpf;
    private String telefone;
    private String dataDeNascimento;
    private String email;
    private String complemento;

    public Funcionario(String nome, String endereco, String cpf, String telefone, String dataDeNascimento, String email, String complemento) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataDeNascimento = dataDeNascimento;
        this.email = email;
        this.complemento = complemento;
    }

    public Funcionario() {

    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String imprimir() {
        return "\nNOME: " + nome
                + "\nENDERECO: " + endereco
                + "\nEMAIL: " + email
                + "\nTELEFONE: " + telefone;
    }

    public class Gerente extends Funcionario {

        public Gerente(String nome, String endereco, String cpf, String telefone,
                String dataDeNascimento, String email) {
            super(nome, endereco, cpf, telefone, dataDeNascimento, email, complemento);
        }

    }
}
