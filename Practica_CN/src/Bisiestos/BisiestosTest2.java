package Bisiestos;

import static org.junit.Assert.*;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.*;

@RunWith (Parameterized.class)
public class BisiestosTest2 {
    public int a;

    public BisiestosTest2 (int a)
    {
       this.a = a;
    }

   @Parameters
   public static Collection<Object[]> contarValues()
   {
       return Arrays.asList (new Object [][] {{-1}, {2}, {0}, {2000}, {2200}, {1900}}); 
   }

   /* Estos tests comprueban que cumple con los requisitos
    * con múltiples entradas diferentes
    */
   @Test
   public void additionTest()
   {
	   assertTrue ("Addition Test", true == Bisiestos.esBisiesto (a));
   }
}
