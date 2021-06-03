package com.aula.rest;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aula.modelos.ProdutoModelo;
import com.aula.negocio.ProdutoServico;

@RestController
public class ProdutoAPI {

	// Injeção de Dependência
	@Autowired
	ProdutoServico servico;
	
	// Salvar
	@RequestMapping(value= "/produtos", method=RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Integer> salvar(@RequestBody ProdutoModelo produto){		
		return new ResponseEntity<>(servico.salvar(produto),HttpStatus.OK);		
	}
	
	// Atualizar
	@RequestMapping(value= "/produtos", method=RequestMethod.PUT, produces = "application/json")
	public ResponseEntity<Void> atualizar(@RequestBody ProdutoModelo produto){		
		servico.atualizar(produto);
		return new ResponseEntity<>(HttpStatus.OK);		
	}
	
	// Deletar
	@RequestMapping(value= "/produtos/{id}", method=RequestMethod.DELETE, produces = "application/json")
	public ResponseEntity<Void> deletar(@PathVariable("id") Integer id){
		servico.deletar(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	// Buscar pelo ID
	@RequestMapping(value= "/produtos/{id}", method=RequestMethod.GET, produces = "application/json")
	public ResponseEntity<ProdutoModelo> buscar(@PathVariable("id") Integer id){
		return new ResponseEntity<>(servico.buscar(id),HttpStatus.OK);
	}
	
	// Listar
	@RequestMapping(value= "/produtos", method=RequestMethod.GET, produces = "application/json")
	public ArrayList<ProdutoModelo> listar(){
		return servico.listar();
	}
	
}
