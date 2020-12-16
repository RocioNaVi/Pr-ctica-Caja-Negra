package DescuentoBlackFriday;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import Embotelladora.NoSolution;

@RunWith (Parameterized.class)
public class DescuentoBlackFridayTest2 {
	private double precioOriginal, porcentajeDescuento;   // Entrada 
	private double total; //Salida
	DescuentoBlackFriday descuento = new DescuentoBlackFriday();
	public DescuentoBlackFridayTest2(double precioOri, double porcentaje, double tot){
		this.precioOriginal = precioOri;
		this.porcentajeDescuento = porcentaje;
		this.total = tot;
	}

	@Parameters public static Collection<Object[]> contarbotellas(){
		return Arrays.asList (new Object[][]{{100,5,95},{50,1,49.5},{40,10,36},{400,10,360},{92.50,50,41.25},{12,2,11.76}});
	}
	
	@Test public void Botellas_Peq_Test() throws NoSolution
	{
		assertTrue ("calculaDescuento", total ==  descuento.precioFinal (precioOriginal, porcentajeDescuento));
	}
}

