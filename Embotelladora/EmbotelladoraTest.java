package Embotelladora;

import org.junit.*;

import Bisiestos.Bisiestos;
import Bisiestos.Integer;
import Bisiestos.NullPointerException;
import Bisiestos.Test;

import java.security.InvalidParameterException;

public class EmbotelladoraTest {
	private int pequenas, grandes, total;   // Entrada 

	/* 
	 * CARACTERIZACIONES:
	 * C1: La entrada no sea un número positivo
	 * 		B1: Negativo
	 * 		B2: Caso frontera = 0
	 * 		B3: Caso frontera en el total = 0
	 */
	
	   
	   /* C1.B1 */
	   @Test (expected = InvalidParameterException.class)
	   public void testForNegativeIntInPeq()
	   {
		   pequenas = -40;
		   grandes = 2;
		   total = 19;
		   Embotelladora.calculaBotellasPequenas (pequenas, grandes, total);
	   }
	   
	   @Test (expected = InvalidParameterException.class)
	   public void testForNegativeIntInGran()
	   {
		   pequenas = 10;
		   grandes = -2;
		   total = 19;
		   Embotelladora.calculaBotellasPequenas (pequenas, grandes, total);
	   }
	   
	   @Test (expected = InvalidParameterException.class)
	   public void testForNegativeIntInTotal()
	   {
		   pequenas = 4;
		   grandes = 3;
		   total = -19;
		   Embotelladora.calculaBotellasPequenas (pequenas, grandes, total);
	   }
	   
	   /* C1.B2 */
	   @Test (expected = InvalidParameterException.class)
	   public void testForZeroInPeq()
	   {
		   pequenas = 0;
		   grandes = 4;
		   total = 20;
		   Embotelladora.calculaBotellasPequenas (pequenas, grandes, total);
	   }
	   
	   
	   @Test (expected = InvalidParameterException.class)
	   public void testForNegativeIntInTot()
	   {
		   pequenas = 20;
		   grandes = 10;
		   total = 0;
		   Embotelladora.calculaBotellasPequenas (pequenas, grandes, total);
	   }
	   
}	 