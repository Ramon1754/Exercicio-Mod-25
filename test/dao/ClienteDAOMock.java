package dao;

import main.java.dao.IClienteDAO;
import main.java.domain.Cliente;
import main.java.exeptions.TipoChaveNaoEncontradaException;

import java.util.Collection;

public class ClienteDAOMock implements IClienteDAO {

    @Override
    public Boolean cadastrar(Cliente entity) throws TipoChaveNaoEncontradaException {
        return true;
    }

    @Override
    public void excluir(Long valor) {

    }

    @Override
    public void alterar(Cliente entity) throws TipoChaveNaoEncontradaException{

    }

    @Override
    public Cliente consultar(Long valor) {
        Cliente cliente = new Cliente();
        cliente.setCpf(valor);
        return cliente;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return null;
    }

    @Override
    public Boolean salvar(Cliente cliente) {
        return null;
    }

    @Override
    public Cliente buscarPorCpf(Long cpf) {
        return null;
    }
}
