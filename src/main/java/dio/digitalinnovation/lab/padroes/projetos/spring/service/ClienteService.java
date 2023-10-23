package dio.digitalinnovation.lab.padroes.projetos.spring.service;

import dio.digitalinnovation.lab.padroes.projetos.spring.model.Cliente;

public interface ClienteService {

	Iterable<Cliente> buscarTodos();

	Cliente buscarPorId(Long id);

	void inserir(Cliente cliente);

	void atualizar(Long id, Cliente cliente);

	void deletar(Long id);

}
