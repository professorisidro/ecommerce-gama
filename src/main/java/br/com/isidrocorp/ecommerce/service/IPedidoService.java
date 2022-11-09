package br.com.isidrocorp.ecommerce.service;

import java.util.ArrayList;

import br.com.isidrocorp.ecommerce.dto.FaturamentoMensal;
import br.com.isidrocorp.ecommerce.model.Pedido;

public interface IPedidoService {

	public Pedido inserirNovo(Pedido novo);
	public Pedido recuperarPeloNumero(Integer numero);
	public ArrayList<FaturamentoMensal> recuperarFaturamento(Integer ano);
}
