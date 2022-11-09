package br.com.isidrocorp.ecommerce.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.isidrocorp.ecommerce.dao.PedidoDAO;
import br.com.isidrocorp.ecommerce.dto.FaturamentoMensal;
import br.com.isidrocorp.ecommerce.model.ItemPedido;
import br.com.isidrocorp.ecommerce.model.Pedido;

@Service
public class PedidoServiceImpl implements IPedidoService{

	@Autowired
	private PedidoDAO dao;
	
	@Override
	public Pedido inserirNovo(Pedido novo) {
		// TODO Auto-generated method stub
		// antes de fazer um SAVE, eu preciso indicar aos "filhos" (itens) a qual pedido eles pertencem
		for (ItemPedido item: novo.getItens()) {
			item.setPedido(novo);
		}
		return dao.save(novo);
	}

	@Override
	public Pedido recuperarPeloNumero(Integer numero) {
		// TODO Auto-generated method stub
		return dao.findById(numero).orElse(null);
	}

	@Override
	public ArrayList<FaturamentoMensal> recuperarFaturamento(Integer ano) {
		// TODO Auto-generated method stub
		return dao.recuperarFaturamentoPorAno(ano);
	}

}
