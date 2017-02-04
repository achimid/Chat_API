package br.com.achimid.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Mensagem")
public class Mensagem implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
    @Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_seq")
	@SequenceGenerator(name = "gen_seq", sequenceName = "Mensagem_id_mensagem")
	private Integer id_mensagem;
	
	@Column(name = "texto")
	private String texto;
	
	@Column(name = "id_loja")
	private Integer id_loja;

	public Integer getId_mensagem() {
		return id_mensagem;
	}

	public void setId_mensagem(Integer id_mensagem) {
		this.id_mensagem = id_mensagem;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Integer getId_loja() {
		return id_loja;
	}

	public void setId_loja(Integer id_loja) {
		this.id_loja = id_loja;
	}
	
	
	
}
