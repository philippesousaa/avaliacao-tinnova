package com.tinnova.exercicio5.service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.tinnova.exercicio5.model.Veiculo;

public class VeiculoService {
	private VeiculoService() {
	}

	public static List<Veiculo> listarTodosVeiculos() {
		return Veiculo.listAll();
	}

	public static List<Veiculo> listarNome(String marca) {
		return Veiculo.list(" where marca = :marca", marca);
	}

	public static Veiculo veiculoPorId(Long idVeiculo) {
		return Veiculo.findById(idVeiculo);
	}

	public static Veiculo criarVeiculo(Veiculo veiculo) {
		veiculo.setCreated(LocalDateTime.now());
		veiculo.persist();
		return veiculo;
	}

	public static Veiculo alterarDadosVeiculo(Long idVeiculo, Veiculo veiculo) {
		Map<String, Object> params = new HashMap<>();
		params.put("veiculo", veiculo.getVeiculo());
		params.put("marca", veiculo.getMarca());
		params.put("ano", veiculo.getAno());
		params.put("descricao", veiculo.getDescricao());
		params.put("vendido", veiculo.getVendido());
		params.put("updated", LocalDateTime.now());

		Veiculo.update(
				"veiculo = :veiculo, marca = :marca, ano = :ano, descricao = :descricao, vendido = :vendido, updated = :updated",
				params);
		return veiculo;
	}

	public static void deletarVeiculo(Long idVeiculo) {
		Veiculo.deleteById(idVeiculo);
	}

}
