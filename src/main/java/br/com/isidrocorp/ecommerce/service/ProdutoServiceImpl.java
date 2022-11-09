package br.com.isidrocorp.ecommerce.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.isidrocorp.ecommerce.dao.ProdutoDAO;
import br.com.isidrocorp.ecommerce.model.Departamento;
import br.com.isidrocorp.ecommerce.model.Produto;

@Service
public class ProdutoServiceImpl implements IProdutoService {

	@Autowired
	private ProdutoDAO dao;
	
	@Override
	public ArrayList<Produto> recuperarTodos() {
		// TODO Auto-generated method stub
		return (ArrayList<Produto>)dao.findAll();
//		return dao.findByOrderByPrecoDesc();
//		return dao.findByNomeContaining("USB");
	}

	@Override
	public Produto recuperarPeloCodigo(Integer codigo) {
		// TODO Auto-generated method stub
		return dao.findById(codigo).orElse(null);
	}

	@Override
	public Produto cadastrarNovo(Produto novo) {
		// TODO Auto-generated method stub
		return dao.save(novo);
	}

	@Override
	public ArrayList<Produto> buscarPorPalavraChave(String palavra) {
		// TODO Auto-generated method stub
		return dao.findByNomeContaining(palavra);
	}

}
