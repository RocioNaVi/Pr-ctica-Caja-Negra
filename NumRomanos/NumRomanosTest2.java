package NumRomanos;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith (Parameterized.class)
public class NumRomanosTest2 {
    public String s;
    public int result;

    public NumRomanosTest2 (String s, int result)
    {
       this.s = s;
       this.result = result;
    }

   @Parameters
   public static Collection<Object[]> contarValues()
   {
       return Arrays.asList (new Object [][] {{"V", 5}, {"CM", 900}, {"EE", 56}, {"CMXCIX", 999}, {" V", 5}}); 
   }

   /* Estos tests comprueban que cumple con los requisitos
    * con múltiples entradas diferentes
    */
   @Test
   public void additionTest()
   {
	   assertTrue ("Addition Test", result == NumRomanos.convierte (s));
   }
}
