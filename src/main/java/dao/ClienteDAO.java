package main.java.dao;

import main.java.dao.generics.GenericDAO;
import main.java.domain.Cliente;
public class ClienteDAO extends GenericDAO<Cliente> implements IClienteDAO {

    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public void atualiarDados(Cliente entity, Cliente entityCadastrado) {

    }

    @Override
    public Cliente buscarPorCpf(Long cpf) {
        return null;
    }

    @Override
    public Boolean salvar(Cliente cliente) {
        return null;
    }
}
