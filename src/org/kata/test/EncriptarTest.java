package org.kata.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.kata.encriptador.Encriptador;

public class EncriptarTest {

	@Test
	public void testEncriptarNotNull() {
		Encriptador encriptador = new Encriptador();
		assertNotEquals(null, encriptador.encriptar("input", "key"));
	}
	
	@Test
	public void testEncriptarArgumentoVacio() {
		Encriptador encriptador = new Encriptador();
		assertEquals("", encriptador.encriptar("", ""));
	}
	
	@Test
	public void testDesencriptarNotNull() {
		Encriptador encriptador = new Encriptador();
		assertNotEquals(null, encriptador.desencriptar("input", "key"));
	}
	
	@Test
	public void testDesencriptar() {
		Encriptador encriptador = new Encriptador();
		String texto = encriptador.encriptar("input", "key");
		String resultado = encriptador.desencriptar(texto, "key");
		
		assertEquals("input", resultado);
	}

}
