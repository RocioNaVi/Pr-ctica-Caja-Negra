package DescuentoBlackFriday;

import static org.junit.Assert.assertTrue;
import java.lang.IllegalArgumentException;
import java.util.Calendar;

import org.junit.Test;

public class DescuentoBlackFridayTest {
	private double precioOriginal, porcentajeDescuento;   // Entrada 
	private Calendar date;
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
	 * 		B2: Fecha no válida por mes
	 * 		B2. Fecha no válida por mes
	 */
	
	  /* C1.B1 */
	  @Test (expected = IllegalArgumentException.class)
	  public void testForNegativeIntInPrecio()
	  {
		  date.set(2020, 11,29); 
		  precioOriginal = -40;
		  porcentajeDescuento = 2;
		  descuento.precioFinal (precioOriginal, porcentajeDescuento, date);
	  }
	  /* C1.B2 */
	  @Test 
	  public void testForZeroInPrecio()
	  {
		  date.set(2020, 11,29); 
		  precioOriginal = 0;
		  porcentajeDescuento = -20;
		  assertTrue ("C1.B2", 0 ==  descuento.precioFinal (precioOriginal, porcentajeDescuento, date));
	  }
	  
	  /* C1.B3 */
	  @Test (expected = IllegalArgumentException.class)
	  public void testForNegativeDesct()
	  {
		  date.set(2020, 11,29); 
		  precioOriginal = 30;
		  porcentajeDescuento = -20;
		  descuento.precioFinal (precioOriginal, porcentajeDescuento, date);
	  }
	  
	  /* C1.B4 */
	  @Test 
	  public void testForZeroInDesc()
	  {
		  date.set(2020, 11,29); 
		  precioOriginal = 20;
		  porcentajeDescuento = 0;
		  assertTrue ("C1.B4", 20 ==  descuento.precioFinal (precioOriginal, porcentajeDescuento, date));
	  }
	  
	  /* C2.B1  */
	  @Test 
	  public void testForFechaValida()
	  {
		  date.set(2020, 11,29); 
		  precioOriginal = 20;
		  porcentajeDescuento = 10;
		  assertTrue ("C2.B1", 18 ==  descuento.precioFinal (precioOriginal, porcentajeDescuento, date));
	  }
	  /* C2.B2  */
	  @Test 
	  public void testForFechaNoValidaMes()
	  {
		  date.set(2020, 10,29); 
		  precioOriginal = 20;
		  porcentajeDescuento = 10;
		  assertTrue ("C2.B2", 20 ==  descuento.precioFinal (precioOriginal, porcentajeDescuento, date));
	  }
	  /* C2.B3  */
	  @Test 
	  public void testForFechaNoValidaDia()
	  {
		  date.set(2020, 11,30); 
		  precioOriginal = 20;
		  porcentajeDescuento = 10;
		  assertTrue ("C2.B3", 20 ==  descuento.precioFinal (precioOriginal, porcentajeDescuento, date));
	  }
}
