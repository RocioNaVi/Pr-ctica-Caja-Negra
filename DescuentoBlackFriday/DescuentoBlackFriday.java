package DescuentoBlackFriday;

import java.lang.IllegalArgumentException;	
import java.util.Calendar;

public class DescuentoBlackFriday {
	// @param  precioOriginal es el precio de un producto marcado en la etiqueta
	//         porcentajeDescuento es el descuento a aplicar expresado como un porcentaje
	// @return el precio final teniendo en cuenta que si es black friday (29 de noviembre) se aplica
	//         un descuento de porcentajeDescuento
	// @throws IllegalArgumentException si precioOriginal es negativo
	
	public double precioFinal(double precioOriginal, double porcentajeDescuento, Calendar fecha) throws IllegalArgumentException{
		
		double precioFinal;
		int dia = 29;
		int mes = 11; 
		
		if (fecha.get(Calendar.DATE) == dia && fecha.get(Calendar.MONTH) == mes) 
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
