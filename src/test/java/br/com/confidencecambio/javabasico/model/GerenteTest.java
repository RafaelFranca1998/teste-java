package br.com.confidencecambio.javabasico.model;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GerenteTest {

	Logger logger = LoggerFactory.getLogger(GerenteTest.class);

	@Test
	public void nomePreenchidoCoretamente() {
		var gerente = new Gerente();
		gerente.setNome("Rafael cruz da França");
		logger.info("######################################");
		logger.info("#############Gerente##################");
		logger.info("######################################");
		logger.info("Nome: " + gerente.getNome());
		logger.info("Nome Maiusculo: " + gerente.getNomeMaiusculo());
		logger.info("Primeiro Nome: " + gerente.getPrimeiroNome());
		logger.info("Ultimo Nome: " + gerente.getUltimoNome());
		logger.info("Nome Abreviado: " + gerente.getNomeAbreviado());

		assertEquals(gerente.getNome(), "Rafael cruz da França");
		assertEquals(gerente.getNomeMaiusculo(), "RAFAEL CRUZ DA FRANÇA");
		assertEquals(gerente.getPrimeiroNome(), "Rafael");
		assertEquals(gerente.getUltimoNome(), "cruz da França");
		assertEquals(gerente.getNomeAbreviado(), "Rafael C. da França");
	}

	@Test
	public void nomeComEspacoNoFim() {
		var gerente = new Gerente();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			gerente.setNome("Rafael cruz da França ");
		});
	}

	@Test
	public void nomeComEspacoNoInicio() {
		var gerente = new Gerente();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			gerente.setNome(" Rafael cruz da França");
		});
	}

	@Test
	public void nomeComNomeNulo() {
		var gerente = new Gerente();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			gerente.setNome(null);
		});
	}

	@Test
	public void nomeComNomeVazio() {
		var gerente = new Gerente();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			gerente.setNome("");
		});
	}
}