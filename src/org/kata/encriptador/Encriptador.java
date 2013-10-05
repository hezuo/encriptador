package org.kata.encriptador;

public class Encriptador {
		

	public String encriptar(String input, String key) {
		StringBuffer llaveEncriptada = new StringBuffer();
		llaveEncriptada.append(key);
		llaveEncriptada.append(input);
		
		return llaveEncriptada.toString();
	}

	public String desencriptar(String input, String key) {
		StringBuffer desencriptada = new StringBuffer();		
		
		if( input.startsWith(key) ){
			desencriptada.append(input.substring(key.length()) );
		}
		
		return desencriptada.toString();
	}

}
