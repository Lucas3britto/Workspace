public class AppPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Lucas", 27, "Masculino");
        Pessoa p2 = new Pessoa("Lucas", 27);
        
               
        System.out.printf("Nome: %s \n", p1.getNome());
        System.out.printf("Idade: %s \n", p1.getIdade());
        System.out.printf("Sexo: %s \n", p1.getSexo());
 
        System.out.printf("Nome: %s \n", p2.getNome());
        System.out.printf("Idade: %s \n", p2.getIdade());
    }
}
