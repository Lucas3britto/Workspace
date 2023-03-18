package Procedimento;

public class Procedimento {
        private String nome;
        private String duracao;
        private String id;
        private String valor;

    public Procedimento(String nome, String duracao, String id, String valor) {
        this.nome = nome;
        this.duracao = duracao;
        this.id = id;
        this.valor = valor;
    }
    
        public Procedimento(){
            
        }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    }
