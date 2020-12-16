package DescuentoBlackFriday;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Calendar;
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
	private static Calendar date_1 = Calendar.getInstance();
	private static Calendar date_2 = Calendar.getInstance();
	private Calendar date = Calendar.getInstance();
	
	DescuentoBlackFriday descuento = new DescuentoBlackFriday();
	public DescuentoBlackFridayTest2(double precioOri, double porcentaje, Calendar date, double tot){
		this.precioOriginal = precioOri;
		this.porcentajeDescuento = porcentaje;
		this.date = date; 
		this.total = tot;
	}

	@Parameters 
	public static Collection<Object[]> contarbotellas(){
		date_2.set(2020, 10,10);
		date_1.set(2020, 11,29); 
		return Arrays.asList (new Object[][]{{100,5,date_1,95},{50,1,date_1,49.5},{40,10,date_2,40},{400,10,date_2,400},{92.50,50,date_1, 46.25},{12,2,date_1, 11.76}});
	}
	
	@Test 
	public void DescuentoBlackFriday() throws NoSolution
	{
		assertTrue ("calculaDescuento", total ==  descuento.precioFinal (precioOriginal, porcentajeDescuento, date));
	}
}


