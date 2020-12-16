package DescuentoBlackFriday;

import java.lang.IllegalArgumentException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DescuentoBlackFriday {
	// @param  precioOriginal es el precio de un producto marcado en la etiqueta
	//         porcentajeDescuento es el descuento a aplicar expresado como un porcentaje
	// @return el precio final teniendo en cuenta que si es black friday (29 de noviembre) se aplica
	//         un descuento de porcentajeDescuento
	// @throws IllegalArgumentException si precioOriginal es negativo
	
	public double precioFinal(double precioOriginal, double porcentajeDescuento) throws IllegalArgumentException{
		
		double precioFinal;
		
		
		Calendar fecha = new GregorianCalendar();
	    int mes = fecha.get(Calendar.MONTH);
		int dia = fecha.get(Calendar.DAY_OF_MONTH);

		if (dia == 29 && mes == 11) 
		{
			if (porcentajeDescuento < 0 || precioOriginal < 0)
		       {
				  System.out.println("Se ha introducido un valor incorrecto");
		          throw new IllegalArgumentException ("DescuentoBlackFriday.precioFinal");
		       }
			precioFinal = precioOriginal*porcentajeDescuento/100;
			precioFinal = precioOriginal-precioFinal;
			
			return precioFinal;
		}
		
		return precioOriginal;	
	}
}
