package br.senai.sc.util;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class ValidadorCPFTest {

	static ValidadorCPF validador;

	@BeforeClass
	public static void inicializaTest() {
		validador = new ValidadorCPF();
	}

	@Test
	public void testRetiraCaracteresInvalidos() {
		String cpfParaValidar = "833.853.878-76sakfdja89lsjdflaskjsflsdjadl)&$&�R%$($&(&$($*&($&";
		String cpfAtual = validador.retiraCaracteresInvalidos(cpfParaValidar);
		String cpfEsperado = "8338538787689";
		assertEquals(cpfEsperado, cpfAtual);
	}

	@Test
	public void testIsCPFPadraoByTodos() {
		String[] listCpfPadrao = new String[10];
		for (int i = 0; i < listCpfPadrao.length; i++) {
			listCpfPadrao[i] = (i + "" + i + "" + i + "" + i + "" + i + "" + i
					+ "" + i + "" + i + "" + i + "" + i + "" + i).toString();
		}
		boolean isPadrao = false;
		for (int i = 0; i < listCpfPadrao.length; i++) {
			isPadrao = validador.isCPFPadrao(listCpfPadrao[i]);
			if (isPadrao == false) {
				return;
			}
		}
		assertTrue(isPadrao);
	}

	@Test
	public void testCalculaDigitoVerificador() {
		String cpfParaValidar = "635318113";
		String dgVerificadorRetornou = validador
				.calculaDigitoVerificador(cpfParaValidar);
		String dgEsperado = "20";
		assertEquals(dgEsperado, dgVerificadorRetornou);
	}

	@Test
	public void testValidaCPF() {
		String cpfParaValidar = "635.318.113-20";
		boolean cpfValidado = validador.validaCPF(cpfParaValidar);
		assertTrue(cpfValidado);
	}

	@Test
	public void testValidaCPFNull() {
		boolean cpfValidado = validador.validaCPF(null);
		assertTrue(cpfValidado);
	}

	@Test
	public void testValidaCPFMaior11() {
		boolean cpfValidado = validador.validaCPF("222222222222");
		assertTrue(cpfValidado);
	}
	
	@Test
	public void testvalidaCPFMenor11(){
		boolean cpfValidado = validador.validaCPF("222222222");
		assertTrue(cpfValidado);
	}
	
	@Test
	public void testValidaCPFcom11(){
		boolean cpfValidado = validador.validaCPF("22222222222");
		assertTrue(cpfValidado);
	}

	@Test
	public void testValidaCPFPadrao() {
		boolean cpfValidado = validador.validaCPF("11111111111");
		assertTrue(cpfValidado);

	}

	@Test(expected = NumberFormatException.class)
	public void testCPFNullException() {
		boolean cpfvalidado = validador.validaCPF(null);
		assertTrue(cpfvalidado);

	}

	@Test(expected = NumberFormatException.class)
	public void testCPFPadraoException() {
		boolean cpfValidado = validador.validaCPF("11111111111");
		assertTrue(cpfValidado);
	}

	@Test(expected = NumberFormatException.class)
	public void testCPFMaior11Exception() {
		boolean cpfValidado = validador.validaCPF("2222222222222");
		assertTrue(cpfValidado);
	}

}
