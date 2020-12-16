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
    public boolean result;
    Bisiestos b = new Bisiestos();

    public BisiestosTest2 (int a, boolean result)
    {
       this.a = a;
       this.result = result;
    }

   @Parameters
   public static Collection<Object[]> contarValues()
   {
       return Arrays.asList (new Object [][] {{2, false}, {0, true}, {2000, true}, {2200, false}, {1900, false}}); 
   }

   /* Estos tests comprueban que cumple con los requisitos
    * con múltiples entradas diferentes
    */
   @Test
   public void additionTest()
   {
	   assertTrue ("additionTest", result == b.esBisiesto (a));
   }
}

