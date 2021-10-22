package com.tinnova.exercicio5.resources;

import static io.restassured.RestAssured.given;

import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class VeiculoResourcesTest {

	private static final String json = "{\r\n"
			+ "    \"veiculo\" : \"civic\", \r\n"
			+ "    \"marca\" : \"Honda\",\r\n"
			+ "    \"ano\" : 2021,\r\n"
			+ "    \"descricao\" : \"novo\",\r\n"
			+ "    \"vendido\" : false\r\n"
			+ "}";
	
	@Test
	public void listarVeiculos() {
		given()
		.when()
		.header("Content-type", "application/json")
		.get("/veiculos")
		.then()
		.statusCode(HttpStatus.SC_OK);
	}

	@Test
	public void procurarPorNome() {
		given()
		.when()
		.header("Content-type", "application/json")
		.pathParam("nome", "ferrari")
		.and()
		.get("/veiculos/find/{nome}")
		.then()
		.extract()
		.response();	}

	@Test
	public void veiculoPorId() {
		given()
		.when()
		.header("Content-type", "application/json")
		.pathParam("idVeiculo", "1")
		.and()
		.get("/veiculos/{idVeiculo}")
		.then()
		.extract()
		.response();	}

	@Test
	public void criarVeiculo() {
		given()
		.when()
		.header("Content-type", "application/json")
		.body(json)
		.post("/veiculos")
		.then()
		.statusCode(HttpStatus.SC_OK);
	}

	@Test
	public void alterarVeiculo() {
		given()
		.when()
		.header("Content-type", "application/json")
		.pathParam("idVeiculo", "1")
		.and()
		.put("/veiculos/{idVeiculo}")
		.then()
		.extract()
		.response();
	}

	@Test
	public void alterarNome() {
		given()
		.when()
		.header("Content-type", "application/json")
		.pathParam("idVeiculo", "1")
		.patch("/veiculos/{idVeiculo}")
		.then()
		.extract()
		.response();
	}

	@Test
	public void deletarVeiculo() {
		given()
		.when()
		.header("Content-type", "application/json")
		.pathParam("idVeiculo", "1")
		.delete("/veiculos/{idVeiculo}")
		.then()
		.extract()
		.response();
	}

}
