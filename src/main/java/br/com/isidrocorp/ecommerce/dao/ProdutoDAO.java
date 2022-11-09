package br.com.isidrocorp.ecommerce.dao;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import br.com.isidrocorp.ecommerce.model.Produto;

public interface ProdutoDAO extends CrudRepository<Produto, Integer> {

	// aqui
	public ArrayList<Produto> findByOrderByPreco();
	public ArrayList<Produto> findByOrderByPrecoDesc();
	public ArrayList<Produto> findByNomeContaining(String palavraChave);
}
