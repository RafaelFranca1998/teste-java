package br.com.confidencecambio.javabasico.model;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RoboTest {

	Logger logger = LoggerFactory.getLogger(RoboTest.class);

	@Test
	public void nomePreenchidoCoretamente() {
		var robo = new Robo();
		robo.setNome("Rafael cruz da França");
		logger.info("######################################");
		logger.info("#############Robo##################");
		logger.info("######################################");
		logger.info("Nome: " + robo.getNome());
		logger.info("Nome Maiusculo: " + robo.getNomeMaiusculo());
		logger.info("Primeiro Nome: " + robo.getPrimeiroNome());
		logger.info("Ultimo Nome: " + robo.getUltimoNome());
		logger.info("Nome Abreviado: " + robo.getNomeAbreviado());

		assertEquals(robo.getNome(), "Rafael cruz da França");
		assertEquals(robo.getNomeMaiusculo(), "RAFAEL CRUZ DA FRANÇA");
		assertEquals(robo.getPrimeiroNome(), "Rafael");
		assertEquals(robo.getUltimoNome(), "cruz da França");
		assertEquals(robo.getNomeAbreviado(), "Rafael C. da França");
	}

	@Test
	public void nomeComEspacoNoFim() {
		var robo = new Robo();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			robo.setNome("Rafael cruz da França ");
		});
	}

	@Test
	public void nomeComEspacoNoInicio() {
		var robo = new Robo();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			robo.setNome(" Rafael cruz da França");
		});
	}

	@Test
	public void nomeComNomeNulo() {
		var robo = new Robo();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			robo.setNome(null);
		});
	}

	@Test
	public void nomeComNomeVazio() {
		var robo = new Robo();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			robo.setNome("");
		});
	}
}