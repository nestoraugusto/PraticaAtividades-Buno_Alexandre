package br.senai.sc.util;

import junit.framework.TestCase;

import org.junit.Test;

public class ValidadorCPFTest extends TestCase {

	@Test
	public void testRetiraCaracteresInvalidos() {
		String cpfParaValidar = "833.853.878-76sakfdja89lsjdflaskjsflsdjadl)&$&�R%$($&(&$($*&($&";
		String cpfAtual = ValidadorCPF.retiraCaracteresInvalidos(cpfParaValidar);
		String cpfEsperado = "8338538787689";
		assertEquals(cpfEsperado, cpfAtual);
	}
	
	@Test
	public void testIsCPFPadraoByTodos() {
		String[] listCpfPadrao = new String[10];
		for (int i = 0; i < listCpfPadrao.length; i++) {
			listCpfPadrao[i] = (i+""+i+""+i+""+i+""+i+""+i+""+i+""+i+""+i+""+i+""+i).toString();
		}
		boolean isPadrao = false;
		for (int i = 0; i < listCpfPadrao.length; i++) {
			isPadrao = ValidadorCPF.isCPFPadrao(listCpfPadrao[i]);
			if (isPadrao == false) {
				return;
			}
		}
		assertTrue(isPadrao);
	}
	
	@Test
	public void testCalculaDigitoVerificador() {
		String cpfParaValidar = "635318113";
		String dgVerificadorRetornou = ValidadorCPF.calculaDigitoVerificador(cpfParaValidar);
		String dgEsperado = "20";
		assertEquals(dgEsperado, dgVerificadorRetornou);
	}
	
	@Test
	public void testValidaCPF() {
		String cpfParaValidar = "635.318.113-20";
		boolean cpfValidado = ValidadorCPF.validaCPF(cpfParaValidar);
		assertTrue(cpfValidado);
	}
}






















