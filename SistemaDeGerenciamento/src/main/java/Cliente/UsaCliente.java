package Cliente;

import java.util.ArrayList;

public class UsaCliente {

    private ArrayList<Cliente> cliente = new ArrayList<>();

    public boolean salvar(Cliente c) {
        if (c != null) {
            cliente.add(c);
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Cliente> retornaTodos() {
        return cliente;
    }

}
