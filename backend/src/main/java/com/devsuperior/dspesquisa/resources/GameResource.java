package com.devsuperior.dspesquisa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dspesquisa.dto.GameDto;
import com.devsuperior.dspesquisa.service.GameService;

@RestController // Controller Rest que vai responder pelas requisições
@RequestMapping(value = "/games") // Reconhece uma rota
public class GameResource {

//	@Autowired // faz um pré processamento para entregar uma instância do GameRepository (teste1)
//	private GameRepository gameRepository; 
	
	@Autowired
	private GameService service;
	
	//ResponseEntity retorna uma resposta com algum conteudo
	@GetMapping // Avisa que será uma requisição GET
	public ResponseEntity<List<GameDto>> findAll(){
		
		List<GameDto> list = service.findAll(); // Cria ua lista do tipo Game e chama um método crud findAll() que vai trazer uma lista de games
		return ResponseEntity.ok().body(list); // Trás a resposta ok e no corpo da requisição tras a lista de game que veio do banco
	}
	
}
