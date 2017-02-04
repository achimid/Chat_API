package br.com.achimid.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.achimid.dao.MensagemDAO;
import br.com.achimid.model.Mensagem;

@CrossOrigin("*")
@RestController
public class ChatController {
	
	@Autowired
	private MensagemDAO dao;
	
	@RequestMapping(value = "/chat", method = RequestMethod.POST)
	public Mensagem enviarMensagens(@RequestParam Map<String,String> parans){
		
		Mensagem msg = new Mensagem();
		msg.setId_loja(Integer.parseInt(parans.get("id_loja")));
		msg.setTexto(parans.get("texto"));
		return dao.save(msg); 
	}
	
	@RequestMapping(value = "/chat", method = RequestMethod.GET)
	public List<Mensagem> pegarMensagens(@RequestParam Map<String,String> parans){
		return dao.findByIdMensagemAndIdLoja(
				Integer.parseInt(parans.get("id_mensagem")),
				Integer.parseInt(parans.get("id_loja"))); 
	}

}
