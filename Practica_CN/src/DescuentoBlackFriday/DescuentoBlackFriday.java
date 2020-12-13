package DescuentoBlackFriday;

import java.security.InvalidParameterException;

public class DescuentoBlackFriday {
	// @param  precioOriginal es el precio de un producto marcado en la etiqueta
	//         porcentajeDescuento es el descuento a aplicar expresado como un porcentaje
	// @return el precio final teniendo en cuenta que si es black friday (29 de noviembre) se aplica
	//         un descuento de porcentajeDescuento
	// @throws InvalidParameter si precioOriginal es negativo
	
	public static double precioFinal(double precioOriginal, double porcentajeDescuento) throws InvalidParameterException{
		
		double precioFinal;

		if (porcentajeDescuento > 100 || porcentajeDescuento < 0 || precioOriginal < 0)
	       {
			  System.out.println("Se ha introducido un valor incorrecto");
	          throw new InvalidParameterException ("DescuentoBlackFriday.precioFinal");
	       }
		precioFinal = precioOriginal*porcentajeDescuento/100;
		precioFinal = precioOriginal-precioFinal;
		
		return precioFinal;
	}
}
