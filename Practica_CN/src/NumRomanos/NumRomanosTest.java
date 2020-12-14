package NumRomanos;

import org.junit.*;

import Bisiestos.Bisiestos;
import junit.framework.Test;

import java.security.InvalidParameterException;

public class NumRomanosTest {
	private String s;   // Entrada 

		/* 
		 * CARACTERIZACIONES:
		 * C1: La entrada sea diferente de null
		 * C2: La entrada sea diferente de un string válido
		 * 		B1: String(ITEGER)
		 * 		B2: Letra no permitida
		 * 		B3: BOOLEANString(Letras no permitidas)
		 * C3: La entrada contenga espacios en blanco
		 * 		B1: WhiteSpace al comienzo
		 * 		B2: WhiteSpace entre letras
		 * 		B3: WhiteSpace al final
		 * C4: La entrada en mayusculas o minúsculas
		 * 		B1: Todo en minúsculas
		 * 		B2: Se alternan mayúsculas y minúsculas
		 */
	
	   /* C1 */
	   @Test (expected = NullPointerException.class)
	   public void testForNullElement()
	   {
	      s = null;
	      NumRomanos.convierte (s);
	   }
	   
	   /* C2.B1 */
	   @Test (expected = InvalidParameterException.class)
	   public void testForIntIn()
	   {
		   s = "123";
		   NumRomanos.convierte (s);
	   }
	   
	   /* C2.B2 */
	   @Test (expected = InvalidParameterException.class)
	   public void testForInvalidCharIn()
	   {
		   s = "e";
		   NumRomanos.convierte (s);
	   }
	   
	   /* C2.B3 */
	   @Test (expected = InvalidParameterException.class)
	   public void testForInvalidStringIn()
	   {
		   s = "eyWz";
		   NumRomanos.convierte (s);
	   }
	   
	   /* C3.B1 */
	   @Test
	   public void testForWhiteCharStartIn()
	   {
		   s = "   CMXC";
		   NumRomanos.convierte (s);
	   }
	   
	   /* C3.B2 */
	   @Test
	   public void testForWhiteCharIn()
	   {
		   s = "CM X  C";
		   NumRomanos.convierte (s);
	   }
	   
	   /* C3.B3 */
	   @Test
	   public void testForWhiteCharEndIn()
	   {
		   s = "CMXC   ";
		   NumRomanos.convierte (s);
	   }
	   
	   /* C4.B1 */
	   @Test
	   public void testForNoCapitalLetterIn()
	   {
		   s = "cm";
		   NumRomanos.convierte (s);
	   }
	   
	   /* C4.B2 */
	   @Test
	   public void testForCapitalLetterIn()
	   {
		   s = "cM";
		   NumRomanos.convierte (s);
	   }
}
