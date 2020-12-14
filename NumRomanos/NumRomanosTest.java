package NumRomanos;

import org.junit.*;

import Bisiestos.Bisiestos;

import static org.junit.Assert.assertTrue;

import java.security.InvalidParameterException;

public class NumRomanosTest {
	private String s;   // Entrada 

		/* 
		 * CARACTERIZACIONES:
		 * C1: La entrada sea null
		 * 		B1: Si lo es (excepción)
		 * 		B2: No lo es 
		 * C2: La entrada sea un strig válido (dentro del abc romano)
		 * 		B1: Sí lo es
		 * 		B2: No lo es (numeros o letras no válidas)
		 * C3: La entrada sea un número romano
		 * 		B1: Si lo es
		 * 		B2: No lo es (Comprobar minusculas y restas)
		 * C4: La entrada tiene espacios en blanco
		 * 		B1: Sí los tiene
		 * 		B2: No los tiene
		 */
	
	   /* C1.B1 */
	   @Test (expected = NullPointerException.class)
	   public void testForNullElement()
	   {
	      s = null;
	      NumRomanos.convierte (s);
	   }
	   
	   /* C1.B2 */
	   @Test 
	   public void testForNotNullElement()
	   {
	      s = "XX";
	      assertTrue ("C1.B2", 20 == NumRomanos.convierte (s));
	      
	   }
	   
	   /* C2.B1 */
	   @Test (expected = InvalidParameterException.class)
	   public void testForIntIn()
	   {
		   s = "123";
		   NumRomanos.convierte (s);
	   }
	   
	   /* C2.B1 */
	   @Test (expected = InvalidParameterException.class)
	   public void testForInvalidCharIn()
	   {
		   s = "e";
		   NumRomanos.convierte (s);
	   }
	   
	   /* C2.B1 */
	   @Test (expected = InvalidParameterException.class)
	   public void testForInvalidStringIn()
	   {
		   s = "eyWz";
		   NumRomanos.convierte (s);
	   }
	   
	   /* C2.B2 */
	   @Test 
	   public void testForValidStringIn()
	   {
		   s = "XVX";
		   assertTrue ("C2.B2", 15 == NumRomanos.convierte (s));
	   }
	   
	   /* C3.B1 */
	   @Test
	   public void testForValidIn()
	   {
		   s = "CM";
		   assertTrue ("C3.B1", 900 == NumRomanos.convierte (s));
	   }
	   
	   /* C3.B2 */
	   @Test
	   public void testForCapitalLetterIn()
	   {
		   s = "cM";
		   assertTrue ("C3.B2", 900 == NumRomanos.convierte (s));
	   }
	   
	   /* C3.B2 */
	   @Test
	   public void testForCapitalLetterIn2()
	   {
		   s = "cm";
		   assertTrue ("C3.B2", 900 == NumRomanos.convierte (s));
	   }
	   
	   /* C3.B2 */
	   @Test
	   public void testForResta()
	   {
		   s = "MC";
		   assertTrue ("C3.B2", 900 == NumRomanos.convierte (s));
	   }
	   
	   /* C4.B1 */
	   @Test
	   public void testForWhiteCharStartIn()
	   {
		   s = "   CMXC";
		   assertTrue ("C4.B1", 990 == NumRomanos.convierte (s));
	   }
	   
	   /* C4.B1 */
	   @Test
	   public void testForWhiteCharIn()
	   {
		   s = "CM X  C";
		   assertTrue ("C4.B1", 990 == NumRomanos.convierte (s));
	   }
	   
	   /* C4.B1 */
	   @Test
	   public void testForWhiteCharEndIn()
	   {
		   s = "CMXC   ";
		   assertTrue ("C4.B1", 990 == NumRomanos.convierte (s));
	   }
	   
	   /* C4.B2 */
	   @Test 
	   public void testForNoWhiteCharIn()
	   {
		   s = "XVX";
		   assertTrue ("C4.B2", 15 == NumRomanos.convierte (s));
	   }
}
