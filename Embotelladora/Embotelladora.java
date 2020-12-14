package Embotelladora;

import java.security.InvalidParameterException;

public class Embotelladora {
	
	public static int calculaBotellasPequenas(int pequenas, int grandes, int total) throws NoSolution {

		int Cap_Grande = 5;
		int Cap_Pequeña = 1;
	    float resto;
		int botellas_g;
		int botellas_p;
		
		if (pequenas <= 0 || grandes < 0 || total <= 0)
	       {
			throw new NoSolution ("Parámetros inválidos");
	       }
		
		botellas_g = (int) total/Cap_Grande;
		
		if ( botellas_g <= grandes )
		{
			resto = total - botellas_g*Cap_Grande;
			botellas_p = (int) resto/Cap_Pequeña;
			
			if ( botellas_p <= pequenas ) {
				return botellas_p;
			}
		} else {
			botellas_g = grandes;
			
			resto = total - botellas_g*Cap_Grande;
			botellas_p = (int) resto/Cap_Pequeña;
			
			if ( botellas_p <= pequenas ) {
				return botellas_p;
			}
		}
		
		throw new NoSolution ("No se puede embotellar todo el líquido");
	    
	}
}
