package Embotelladora;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith (Parameterized.class)
public class EmbotelladoraTest2 {
	private int pequenas, grandes, total; 
	private int total_peq;
	Embotelladora botellas = new Embotelladora();

	public EmbotelladoraTest2(int peque, int grand, int tot, int expected) {
		this.pequenas = peque;
		this.grandes = grand;
		this.total = tot;
		this.total_peq = expected;
	}
	
	
	@Parameters public static Collection<Object[]> contarbotellas(){
		return Arrays.asList (new Object[][]{{6,1,5,0},{5,2,13,3},{1,1,1,1},{4,10,19,4},{19,50,101,1},{12,2,21,11}});
	}
	
	@Test public void Botellas_Peq_Test() throws NoSolution
	{
		assertTrue("calculaBotellasPequenas", total_peq == botellas.calculaBotellasPequenas(pequenas, grandes, total));
	}
}


