package Embotelladora;

import org.junit.*;

import static org.junit.Assert.assertTrue;

public class EmbotelladoraTest {
	private int pequenas, grandes, total;   // Entrada 
	Embotelladora botellas = new Embotelladora();

	/* 
	 * CARACTERIZACIONES:
	 * C1: La entrada no sea un número positivo
	 * 		B1: botellas pequeñas Negativas
	 * 		B2: Caso frontera Botella pequeñas = 0
	 * 		B3: botellas grandes Negativas
	 * 		B4: Caso frontera botella grandes = 0
	 * 		B5: total negativo
	 * 		B6: total cero
	 * C2: Funcionalidad
	 * 		B1: Funcionalidad normal
	 * 		B2: No solución
	 * 		B3: 
	 */
	
	   
	   /* C1.B1 */
	   @Test (expected = NoSolution.class)
	   public void testForNegativeIntInPeq() throws NoSolution
	   {
		   pequenas = -40;
		   grandes = 2;
		   total = 19;
		   botellas.calculaBotellasPequenas (pequenas, grandes, total);
	   }
	   
	   /* C1.B2 */
	   @Test (expected = NoSolution.class)
	   public void testForZeroInPeq() throws NoSolution
	   {
		   pequenas = 0;
		   grandes = 4;
		   total = 20;
		   botellas.calculaBotellasPequenas (pequenas, grandes, total);
	   }
	   
	   
	   /* C1.B3 */
	   @Test (expected = NoSolution.class)
	   public void testForNegativeIntInGran() throws NoSolution
	   {
		   pequenas = 10;
		   grandes = -2;
		   total = 19;
		   botellas.calculaBotellasPequenas (pequenas, grandes, total);
	   }
	   
	   /* C1.B4 */
	   @Test
	   public void testForZeroInGran() throws NoSolution
	   {
		   pequenas = 4;
		   grandes = 0;
		   total = 3;
		   assertTrue ("C1.B4", 3 ==  botellas.calculaBotellasPequenas (pequenas, grandes, total));
	   }
	   
	   /* C1.B5 */
	   @Test (expected = NoSolution.class)
	   public void testForNegativeIntInTot() throws NoSolution
	   {
		   pequenas = 4;
		   grandes = 3;
		   total = -19;
		   botellas.calculaBotellasPequenas (pequenas, grandes, total);
	   }
	   
	   /* C1.B6 */
	   @Test (expected = NoSolution.class)
	   public void testForZeroInTot() throws NoSolution
	   {
		   pequenas = 4;
		   grandes = 4;
		   total = 0;
		   assertTrue ("C1.B6", 20 ==  botellas.calculaBotellasPequenas (pequenas, grandes, total));
	   }
	   
	   /* C2.B1 */
	   @Test
	   public void testSolution() throws NoSolution
	   {
		   pequenas = 4;
		   grandes = 4;
		   total = 19;
		   assertTrue ("C1.B4", 4 ==  botellas.calculaBotellasPequenas (pequenas, grandes, total));
	   }
	   
	   /* C2.B2 */
	   @Test (expected = NoSolution.class)
	   public void testForError() throws NoSolution
	   {
		   pequenas = 2;
		   grandes = 1;
		   total = 9;
		   botellas.calculaBotellasPequenas (pequenas, grandes, total);
	   }
	   
}
