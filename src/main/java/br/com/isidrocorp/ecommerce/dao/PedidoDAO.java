package br.com.isidrocorp.ecommerce.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.com.isidrocorp.ecommerce.dto.FaturamentoMensal;
import br.com.isidrocorp.ecommerce.model.Pedido;

public interface PedidoDAO extends CrudRepository<Pedido, Integer>{

	@Query("SELECT new "
		 + "br.com.isidrocorp.ecommerce.dto.FaturamentoMensal(month(p.data), sum(p.valorFinal)) "
		 + "FROM Pedido p "
		 + "WHERE year(p.data) = :ano "		 
		 + "GROUP BY month(p.data) "
		 + "ORDER BY month(p.data) ")
	public ArrayList<FaturamentoMensal> recuperarFaturamentoPorAno(@Param("ano") Integer ano);
}
