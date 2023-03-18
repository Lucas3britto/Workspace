package Procedimento;

import java.util.ArrayList;

public class UsaProcedimento {
    private ArrayList<Procedimento> procedimentos = new ArrayList<>();
    public boolean salvar (Procedimento p){
        if (p != null) {
            procedimentos.add(p);
            return true;
        }
        else{
            return false;
        }
}
    public ArrayList<Procedimento> retornaTodos(){
        return procedimentos;
}

}