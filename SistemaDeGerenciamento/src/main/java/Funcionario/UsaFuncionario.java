package Funcionario;

import java.util.ArrayList;

public class UsaFuncionario {

    private ArrayList<Funcionario> funcionario = new ArrayList<>();

    public boolean salvar(Funcionario f) {
        if (f != null) {
            funcionario.add(f);
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Funcionario> retornaTodos() {
        return funcionario;
    }

}
