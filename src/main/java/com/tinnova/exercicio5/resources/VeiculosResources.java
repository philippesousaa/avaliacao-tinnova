package com.tinnova.exercicio5.resources;

import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.tinnova.exercicio5.model.Veiculo;
import com.tinnova.exercicio5.service.VeiculoService;

@Path("veiculos")
public class VeiculosResources {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Veiculo> listarVeiculos() {
		return VeiculoService.listarTodosVeiculos();
	}

	@GET
	@Path("/find/{nome}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Veiculo> procurarPorNome(@PathParam(value = "nome") String nome) {
		return VeiculoService.listarNome(nome);
	}

	@GET
	@Path("/{idVeiculo}")
	@Produces(MediaType.APPLICATION_JSON)
	public Veiculo veiculoPorId(@PathParam(value = "id") Long id) {
		return VeiculoService.veiculoPorId(id);
	}

	@POST
	@Transactional
	@Consumes(MediaType.APPLICATION_JSON)
	public Veiculo criarVeiculo(Veiculo veiculo) {
		return VeiculoService.criarVeiculo(veiculo);
	}

	@PUT
	@Path("/{idVeiculo}")
	@Transactional
	@Produces(MediaType.APPLICATION_JSON)
	public Veiculo alterarVeiculo(@PathParam("idVeiculo")Long idVeiculo, Veiculo veiculo) {
		return VeiculoService.alterarDadosVeiculo(idVeiculo, veiculo);
	}
	
	@PATCH
	@Transactional
	@Path("/{idVeiculo}")
	@Produces(MediaType.APPLICATION_JSON)
	public Veiculo alterarNome(@PathParam("idVeiculo")Long idVeiculo, Veiculo veiculo){
		return VeiculoService.alterarDadosVeiculo(idVeiculo, veiculo);
	}
	
	@DELETE
	@Transactional
	@Path("/{idVeiculo}")
	public void deletarVeiculo(@PathParam("idVeiculo") Long idVeiculo) {
		VeiculoService.deletarVeiculo(idVeiculo);
	}
}
