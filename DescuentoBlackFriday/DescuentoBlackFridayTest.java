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
package DescuentoBlackFriday;

import static org.junit.Assert.assertTrue;
import java.lang.IllegalArgumentException;

import org.junit.Test;

public class DescuentoBlackFridayTest {
	private double precioOriginal, porcentajeDescuento;   // Entrada 
	DescuentoBlackFriday descuento = new DescuentoBlackFriday();
	/* 
	 * CARACTERIZACIONES:
	 * C1: 	La entrada sea diferente de un int válido
	 * 		B1: Precio original negativo
	 * 		B2: Precio original  = cero
	 * 		B3: Descuento negativo
	 * 		B4: Descuento = cero
	 * C2: Fecha
	 * 		B1: Fecha válida
	 * 		B2: Fecha no válida
	 */
	
	  /* C1.B1 */
	  @Test (expected = IllegalArgumentException.class)
	  public void testForNegativeIntInPrecio()
	  {
		  precioOriginal = -40;
		  porcentajeDescuento = 2;
		  descuento.precioFinal (precioOriginal, porcentajeDescuento);
	  }
	  /* C1.B2 */
	  @Test 
	  public void testForZeroInPrecio()
	  {
		  precioOriginal = 0;
		  porcentajeDescuento = -20;
		  assertTrue ("C1.B2", 0 ==  descuento.precioFinal (precioOriginal, porcentajeDescuento));
	  }
	  
	  /* C1.B3 */
	  @Test (expected = IllegalArgumentException.class)
	  public void testForNegativeDesct()
	  {
		  precioOriginal = 30;
		  porcentajeDescuento = -20;
		  descuento.precioFinal (precioOriginal, porcentajeDescuento);
	  }
	  
	  /* C1.B4 */
	  @Test 
	  public void testForZeroInDesc()
	  {
		  precioOriginal = 20;
		  porcentajeDescuento = 0;
		  assertTrue ("C1.B4", 20 ==  descuento.precioFinal (precioOriginal, porcentajeDescuento));
	  }
	  
	  /* C2.B1  */
}
