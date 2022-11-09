package br.com.isidrocorp.ecommerce.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.isidrocorp.ecommerce.dao.DepartamentoDAO;
import br.com.isidrocorp.ecommerce.model.Departamento;

@Service
public class DepartamentoServiceImpl implements IDepartamentoService {
	
	@Autowired
	private DepartamentoDAO dao;

	@Override
	public Departamento criarNovo(Departamento novo) {
		// TODO Auto-generated method stub
		if (novo.getNome()!= null) {
			return dao.save(novo);
		}
		return null;
	}

	@Override
	public Departamento atualizarDados(Departamento dados) {
		// TODO Auto-generated method stub
		if (dados.getCodigo()!= null && dados.getNome()!= null) {
			return dao.save(dados);
		}
		return null;
	}

	@Override
	public ArrayList<Departamento> buscarTodos() {
		// TODO Auto-generated method stub
		return (ArrayList<Departamento>)dao.findAll();
	}

	@Override
	public Departamento buscarPeloId(Integer id) {
		// TODO Auto-generated method stub
		return dao.findById(id).orElse(null);
	}

	@Override
	public void excluirDepartamento(Integer id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

}
