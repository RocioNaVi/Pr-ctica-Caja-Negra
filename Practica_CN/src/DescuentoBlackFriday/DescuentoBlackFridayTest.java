package DescuentoBlackFriday;

import static org.junit.Assert.assertTrue;

import Embotelladora.Embotelladora;
import Embotelladora.InvalidParameterException;
import Embotelladora.Test;

public class DescuentoBlackFridayTest {
	private double precioOriginal, porcentajeDescuento;   // Entrada 
	/* 
	 * CARACTERIZACIONES:
	 * C1: 	La entrada sea diferente de un int válido
	 * 		B1: Precio original negativo
	 * 		B2: Descuento negativo
	 * 		B3: Precio original  = cero
	 * 		B4: Descuento = cero
	 * C3: La entrada contenga espacios en blanco
	 * 		B1: WhiteSpace al comienzo
	 * 		B2: WhiteSpace entre letras
	 * 		B3: WhiteSpace al final
	 * C4: La entrada en mayusculas o minúsculas
	 * 		B1: Todo en minúsculas
	 * 		B2: Se alternan mayúsculas y minúsculas
	 */
	
	  /* C1.B1 */
	  @Test (expected = IllegalArgumentException.class)
	  public void testForNegativeIntIn_1()
	  {
		  precioOriginal = -40;
		  porcentajeDescuento = 2;
		  DescuentoBlackFriday.precioFinal (precioOriginal, porcentajeDescuento);
	  }
	  /* C1.B2 */
	  @Test (expected = IllegalArgumentException.class)
	  public void testForNegativeIntIn_2()
	  {
		  precioOriginal = 40;
		  porcentajeDescuento = -20;
		  DescuentoBlackFriday.precioFinal (precioOriginal, porcentajeDescuento);
	  }
	  
	  /* C1.B3 */
	  @Test 
	  public void testForNegativeIntIn_3()
	  {
		  precioOriginal = 0;
		  porcentajeDescuento = 20;
		  precioFinal = DescuentoBlackFriday.precioFinal (precioOriginal, porcentajeDescuento);
		  assertTrue("Precio final", (precioFinal == 0));
	  }
	  
	  /* C1.B4 */
	  @Test 
	  public void testForNegativeIntIn_3()
	  {
		  precioOriginal = 20;
		  porcentajeDescuento = 0;
		  precioFinal = DescuentoBlackFriday.precioFinal (precioOriginal, porcentajeDescuento);
		  assertTrue("Precio final", (precioFinal == 20));
	  }
	  
	  /* C2.B1  */
}