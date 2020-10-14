package com.devsuperior.dspesquisa.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dspesquisa.dto.GameDto;
import com.devsuperior.dspesquisa.entities.Game;
import com.devsuperior.dspesquisa.repositories.GameRepository;

@Service //PErmite ser um componente do Spring boot e pde ser ejetado em outras classes
public class GameService {

	@Autowired 
	private GameRepository repository;
	
	@Transactional(readOnly = true)
	public List<GameDto> findAll(){
		
		List<Game> list = repository.findAll();
		return list.stream().map(x-> new GameDto(x)).collect(Collectors.toList());
	}
	
	
}
