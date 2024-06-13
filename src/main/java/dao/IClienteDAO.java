package main.java.dao;

import main.java.dao.generics.IGenericDAO;
import main.java.domain.Cliente;

public interface IClienteDAO extends IGenericDAO<Cliente> {
    Cliente buscarPorCpf(Long cpf);
//    Boolean salvar(Cliente cliente);
//
//    Cliente buscarPorCpf(Long cpf);
//
//    void excluir(Long cpf);
//
//    void alterar(Cliente cliente);
}
