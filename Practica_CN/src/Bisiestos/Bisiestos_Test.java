package Bisiestos;

import org.junit.*;
import java.security.InvalidParameterException;

public class Bisiestos_Test {
	private int a;   // Entrada 

		/* 
		 * CARACTERIZACIONES:
		 * C1: La entrada sea diferente de null
		 * C2: La entrada sea diferente de un int
		 * 		B1: CHAR
		 * 		B2: STRING
		 * 		B3: FLOAT
		 * C3: La entrada no sea un número positivo
		 * 		B1: Negativo
		 * 		B2: Caso frontera = 0
		 * C4: Multiplicidad
		 * 		B1: Divisble entre 4
		 * 		B2: Divisble entre 100
		 * 		B3: Divisble entre 400
		 */
	
	
	   /* C1 */
	   @Test (expected = NullPointerException.class)
	   public void testForNullElement()
	   {
	      a = (Integer) null;
	      Bisiestos.esBisiesto (a);
	   }
	   
	   /* C2.B1 */
	   @Test (expected = InvalidParameterException.class)
	   public void testForCharIn()
	   {
		   a = 'c';
		   Bisiestos.esBisiesto (a);
	   }
	   
	   /* C2.B2 */
	   @Test (expected = InvalidParameterException.class)
	   public void testForStringIn()
	   {
		   a = Integer.valueOf("HOLA");
		   Bisiestos.esBisiesto (a);
	   }
	   
	   /* C2.B3 */
	   @Test (expected = InvalidParameterException.class)
	   public void testForFloatIn()
	   {
		   a = (int) 56.98;
		   Bisiestos.esBisiesto (a);
	   }
	   
	   /* C3.B1 */
	   @Test (expected = InvalidParameterException.class)
	   public void testForNegativeIntIn()
	   {
		   a = -20;
		   Bisiestos.esBisiesto (a);
	   }
	   
	   /* C3.B2 */
	   @Test (expected = InvalidParameterException.class)
	   public void testForZeroIn()
	   {
		   a = 0;
		   Bisiestos.esBisiesto (a);
	   }
	   
	   /* C4.B1 */
	   @Test 
	   public void testForMult4In()
	   {
		   a = 4;
		   Bisiestos.esBisiesto (a);
	   }
	   
	   /* C4.B2 */
	   @Test 
	   public void testForMult100In()
	   {
		   a = 200;
		   Bisiestos.esBisiesto (a);
	   }
	   
	   /* C4.B3 */
	   @Test 
	   public void testForMult400In()
	   {
		   a = 1600;
		   Bisiestos.esBisiesto (a);
	   }
}
