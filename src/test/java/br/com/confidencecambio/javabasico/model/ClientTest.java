package br.com.confidencecambio.javabasico.model;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClientTest {

	Logger logger = LoggerFactory.getLogger(ClientTest.class);

	@Test
	public void nomePreenchidoCoretamente() {
		var cliente = new Cliente();
		cliente.setNome("Rafael cruz da França");
		logger.info("######################################");
		logger.info("#############Cliente##################");
		logger.info("######################################");
		logger.info("Nome: " + cliente.getNome());
		logger.info("Nome Maiusculo: " + cliente.getNomeMaiusculo());
		logger.info("Primeiro Nome: " + cliente.getPrimeiroNome());
		logger.info("Ultimo Nome: " + cliente.getUltimoNome());
		logger.info("Nome Abreviado: " + cliente.getNomeAbreviado());

		assertEquals(cliente.getNome(), "Rafael cruz da França");
		assertEquals(cliente.getNomeMaiusculo(), "RAFAEL CRUZ DA FRANÇA");
		assertEquals(cliente.getPrimeiroNome(), "Rafael");
		assertEquals(cliente.getUltimoNome(), "cruz da França");
		assertEquals(cliente.getNomeAbreviado(), "Rafael C. da França");
	}

	@Test
	public void nomeComEspacoNoFim() {
		var cliente = new Cliente();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			cliente.setNome("Rafael cruz da França ");
		});
	}

	@Test
	public void nomeComEspacoNoInicio() {
		var cliente = new Cliente();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			cliente.setNome(" Rafael cruz da França");
		});
	}

	@Test
	public void nomeComNomeNulo() {
		var cliente = new Cliente();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			cliente.setNome(null);
		});
	}

	@Test
	public void nomeComNomeVazio() {
		var cliente = new Cliente();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			cliente.setNome("");
		});
	}
}