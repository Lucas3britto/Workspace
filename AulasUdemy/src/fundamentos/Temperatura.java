package fundamentos;

public class Temperatura {
    public static void main(String[] args) {
        // (F - 32) x 5/9 = C
        // MINHA FORMA DE RESOLUÇÃO DO EXERCICIO
        double F = 86;
        double C;
        final double ajuste = 32;
        final double fator = 5.0 / 9;
        System.out.println((F - ajuste) * fator);


        //FORMA DE RESPOSTA DO CURSO
        final double FATOR = 5.0/9.0;
        final double AJUSTE = 32;

        double Fahrenheit = 86;
        double Ceslsius = (Fahrenheit - AJUSTE) * FATOR;

        System.out.println(Ceslsius);
    }
}
