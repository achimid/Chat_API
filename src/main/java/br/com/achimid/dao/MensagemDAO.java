package br.com.achimid.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.achimid.model.Mensagem;

public interface MensagemDAO extends CrudRepository<Mensagem, Integer>{

	@Query("SELECT m from Mensagem m WHERE m.id_mensagem > ?1 AND m.id_loja = ?2")
	List<Mensagem> findByIdMensagemAndIdLoja(Integer idMensagem,Integer idLoja);
		
}
