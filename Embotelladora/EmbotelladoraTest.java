package Embotelladora;

import org.junit.*;

import static org.junit.Assert.assertTrue;

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
	   @Test (expected = NoSolution.class)
	   public void testForNegativeIntInPeq() throws NoSolution
	   {
		   pequenas = -40;
		   grandes = 2;
		   total = 19;
		   Embotelladora.calculaBotellasPequenas (pequenas, grandes, total);
	   }
	   
	   @Test (expected = NoSolution.class)
	   public void testForNegativeIntInGran() throws NoSolution
	   {
		   pequenas = 10;
		   grandes = -2;
		   total = 19;
		   Embotelladora.calculaBotellasPequenas (pequenas, grandes, total);
	   }
	   
	   @Test (expected = NoSolution.class)
	   public void testForNegativeIntInTotal() throws NoSolution
	   {
		   pequenas = 4;
		   grandes = 3;
		   total = -19;
		   Embotelladora.calculaBotellasPequenas (pequenas, grandes, total);
	   }
	   
	   /* C1.B2 */
	   @Test (expected = NoSolution.class)
	   public void testForZeroInPeq() throws NoSolution
	   {
		   pequenas = 0;
		   grandes = 4;
		   total = 20;
		   Embotelladora.calculaBotellasPequenas (pequenas, grandes, total);
	   }
	   
	   
	   @Test (expected = NoSolution.class)
	   public void testForNegativeIntInTot() throws NoSolution
	   {
		   pequenas = 20;
		   grandes = 10;
		   total = 0;
		   Embotelladora.calculaBotellasPequenas (pequenas, grandes, total);
	   }
	   
	   @Test (expected = NoSolution.class)
	   public void testForError() throws NoSolution
	   {
		   pequenas = 2;
		   grandes = 1;
		   total = 9;
		   assertTrue ("additionTest", 2 == Embotelladora.calculaBotellasPequenas (pequenas, grandes, total));
	   }
	   
}	  
