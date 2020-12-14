package NumRomanos;
import org.junit.*;

public class NumRomanos {
	
	// @param s es un número romano
	// @return el número s en base 10
	// @throws InvalidParameter si s no es un número romano
	public int convierte(String s) throws InvalidParameter {
		char Rom[]={'','I','V','L','C','D','M'};
		int valor[]= {0,1,5,10,50,100,500,1000};
		int numero = 0;
		int ant = 0;
		boolean NotRom = True;
		for(i=0; i<s.length(); i++) {
			NotRom = False;
			letra = s[i];
			for(j=0; j<Rom.length(); j++) {
				if(letra == Rom[j]) {
					NotRom = False;
					numero = numero + valor[j];
					if(ant<valor[j]){
						numero = numero - ant*2;
					}
					ant = valor[j];
				}
			}
			if(j == Rom.length() && NotRom) {
				throw new InvalidParameter("No es un número romano");
			}
		}
		return numero;
	}
}
