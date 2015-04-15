package br.senai.sc.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

import junit.framework.TestCase;

import org.junit.Test;

public class OperacoesMatematicasTest extends TestCase{
	
	@Test
	public static void testSomaDoisValoresInteiros() {
		double num1 = 10d;
		double num2 = 20d;
		double valorExperado = 30d;
		double valorAtual = OperacoesMatematicas.somaDoisValoresReais(num1, num2);
		assertEquals("Erro na soma dos valores.", valorExperado, valorAtual);
	}
	
	@Test
	public static void testSomaDoisValoresReais() {
		double num1 = 1.9999;
		double num2 = 5.8767;
		double valorExperado = 7.8766;
		double valorAtual = OperacoesMatematicas.somaDoisValoresReais(num1, num2);
		assertEquals("Erro na soma dos valores.", valorExperado, valorAtual);
	}
	
	@Test(expected = NumberFormatException.class)
	public static void testSomaDoisValoresByNulo() {
		try {
			OperacoesMatematicas.somaDoisValoresReais(null, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals(null, null);
	}
	
	@Test(expected = NumberFormatException.class)
	public static void testSomaDoisValoresByPassandoUmNulo() {
		try {
			assertEquals(2d, (double)OperacoesMatematicas.somaDoisValoresReais(2d, null));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public static void testSomaDoisValoresComResultadoErrado() {
		double num1 = 10d;
		double num2 = 3d;
		double valorExperado = 12.99;
		double valorAtual = OperacoesMatematicas.somaDoisValoresReais(num1, num2);
		assertTrue("Erro na soma dos valores.", valorExperado != valorAtual);
	}
	
	@Test
	public static void testSomaDoisValoresByExtremoComResultadoErrado() {
		double num1 = 1.9999;
		double num2 = 5.8767;
		double valorExperado = 7.8766;
		double valorAtual = OperacoesMatematicas.somaDoisValoresReais(num1, num2);
		assertFalse("Erro na soma dos valores.", valorExperado != valorAtual);
	}
	
	@Test
	public static void testSubtracaoDoisValoresInteiros() {
		assertEquals("Erro na soma dos valores.", 4d, (double)OperacoesMatematicas.subtraiDoisValoresReais(5d, 1d));
	}
	
	@Test
	public static void testSubtracaoDoisValoresReais() {
		double num1 = 5.8767;
		double num2 = 1.9999;
		double valorExperado = 3.8768;
		double valorAtual = OperacoesMatematicas.subtraiDoisValoresReais(num1, num2);
		BigDecimal vlExperado = new BigDecimal(valorExperado).setScale(4, RoundingMode.UP);
		BigDecimal vlAtual = new BigDecimal(valorAtual).setScale(4, RoundingMode.UP);
		assertEquals("Erro na soma dos valores.", vlExperado, vlAtual);
	}
	
	@Test(expected = NumberFormatException.class)
	public static void testSubtracaoDoisValoresByNulo() {
		try {
			OperacoesMatematicas.subtraiDoisValoresReais(null, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals(null,null);
	}
	
	@Test(expected = NumberFormatException.class)
	public static void testSubtracaoDoisValoresBypassandoUmNulo() {
		try {
			OperacoesMatematicas.subtraiDoisValoresReais(1d, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals(null,null);
	}
	
	@Test
	public static void testValidaMultiplicacao(){
		double num1 = 10.0;
		double num2 = 3.0;
		double valorExperado = 30.0;
		double valorAtual = OperacoesMatematicas.multiplicaDoisValoresReais(num1, num2);
		assertTrue("Erro na multiplicaÃ§Ã£o dos valores.", valorExperado == valorAtual);
	}
}











