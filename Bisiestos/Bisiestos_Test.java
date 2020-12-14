package Bisiestos;

import org.junit.*;

import static org.junit.Assert.assertTrue;
import java.lang.IllegalArgumentException;

public class Bisiestos_Test {
	private int a;   // Entrada 

		/* 
		 * CARACTERIZACIONES:
		 * C1: La entrada es un número positivo
		 * 		B1: Sí lo es
		 * 		B2: No es positivo
		 * 		B3: Caso frontera -> 0
		 * C2: Entrada múltiple de 4
		 * 		B1: Sí lo es
		 * 		B2: No lo es
		 * C3: Entrada múltiple de 100
		 * 		B1: Sí lo es
		 * 		B2: No lo es
		 * C4: Entrada múltiple de 100
		 * 		B1: Sí lo es
		 * 		B2: No lo es
		 * C5: Entrada múltiple de 4 y no de 100
		 * 		B1: Sí lo es
		 * 		B2: No lo es (Es multiplo de 4 y de 100)
		 * C6: Entrada múltiple de 4 y de 100 y no de 400
		 * 		B1: Sí lo es
		 * 		B2: No lo es
		 */
	
	   /* C1.B1 */
	   @Test 
	   public void testForPositiveIn()
	   {
		   a = 20;
		   assertTrue ("C1.B1", true == Bisiestos.esBisiesto (a));
	   }
	   
	   /* C1.B1 */
	   @Test 
	   public void testForPositiveIn2()
	   {
		   a = 1;
		   assertTrue ("C1.B1 2", false == Bisiestos.esBisiesto (a));
	   }
	   
	   /* C1.B2 */
	   @Test (expected = IllegalArgumentException.class)
	   public void testForNegativeIn()
	   {
		   a = -20;
		   Bisiestos.esBisiesto (a);
	   }
	   
	   /* C1.B3 */
	   @Test 
	   public void testForZeroIn()
	   {
		   a = 0;
		   assertTrue ("C1.B3", true == Bisiestos.esBisiesto (a));
	   }
	   
	   /* C2.B1 */
	   @Test 
	   public void testForMult4In()
	   {
		   a = 4;
		   assertTrue ("C2.B1", true == Bisiestos.esBisiesto (a));
	   }
	   
	   /* C2.B2 */
	   @Test 
	   public void testForNoMult4In()
	   {
		   a = 6;
		   assertTrue ("C2.B2", false == Bisiestos.esBisiesto (a));
	   }
	   
	   /* C3.B1 */
	   @Test 
	   public void testForMult100In()
	   {
		   a = 200;
		   assertTrue ("C3.B1", false == Bisiestos.esBisiesto (a));
	   }
	   
	   /* C3.B2 */
	   @Test 
	   public void testForNoMult100In()
	   {
		   a = 214;
		   assertTrue ("C3.B2", false == Bisiestos.esBisiesto (a));
	   }
	   
	   /* C4.B1 */
	   @Test 
	   public void testForMult400In()
	   {
		   a = 800;
		   assertTrue ("C4.B1", true == Bisiestos.esBisiesto (a));
	   }
	   
	   /* C4.B2 */
	   @Test 
	   public void testForNoMult400In()
	   {
		   a = 100;
		   assertTrue ("C4.B2", false == Bisiestos.esBisiesto (a));
	   }
	   
	   /* C5.B1 */
	   @Test 
	   public void testForMult4No100In()
	   {
		   a = 176;
		   assertTrue ("C5.B1", true == Bisiestos.esBisiesto (a));
	   }
	   
	   /* C5.B2 */
	   @Test 
	   public void testForMult4y100In()
	   {
		   a = 3100;
		   assertTrue ("C5.B2", false == Bisiestos.esBisiesto (a));
	   }
	   
	   /* C6.B1 */
	   @Test 
	   public void testForMult4y100No400In()
	   {
		   a = 2200;
		   assertTrue ("C6.B1", false == Bisiestos.esBisiesto (a));
	   }
	   
	   /* C6.B2 */
	   @Test 
	   public void testForMult4y100y400In()
	   {
		   a = 1360;
		   assertTrue ("C6.B2"
		   		+ "", true == Bisiestos.esBisiesto (a));
	   }  
} 
