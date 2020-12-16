package NumRomanos;

import java.security.InvalidParameterException;
import java.util.Hashtable;

public class NumRomanos {
	
	
	public static Hashtable<String, Integer> llenarHashtable()
	{
		Hashtable<String, Integer> numerosRomanos = new Hashtable<String, Integer>();
		numerosRomanos.put(" ", 0);
		numerosRomanos.put("I", 1);
		numerosRomanos.put("V", 5);
		numerosRomanos.put("X", 10);
		numerosRomanos.put("L", 50);
		numerosRomanos.put("C", 100);
		numerosRomanos.put("D", 500);
		numerosRomanos.put("M", 1000);
		
		return numerosRomanos;	//Hashtable lleno
	}
	
	
	// @param s es un número romano
	// @return el número s en base 10
	// @throws InvalidParameter si s no es un número romano
	public int convierte(String s) throws InvalidParameterException {
		int numero = 0;	//Variable de retorno
		int valor = 0; // Valor de la letra
		int ant = 0;
		char letra;
		boolean esta;
		for(int i=0; i<s.length(); i++) {
			letra = s.charAt(i);
			Hashtable<String, Integer> numerosRomanos = llenarHashtable();
			esta = numerosRomanos.containsKey(Character.toString(letra).toUpperCase());
			if(esta) {
				valor = numerosRomanos.get(Character.toString(letra).toUpperCase());
				numero = numero + valor;
				if(ant<valor){
					numero = numero - ant*2;
				}else {
					ant = valor;
				}
			}else{
				throw new InvalidParameterException("No es un número romano");
			}
		}
		return numero;
	}
}
