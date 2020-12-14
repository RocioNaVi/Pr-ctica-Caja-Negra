package Bisiestos;

public class Bisiestos {
	
	// @param a un número entero positivo
	// @return true si a es un año bisiesto
	// false en caso contrario.
	// @throws InvalidParameter si a no es un parámetro válido.
	public boolean esBisiesto(int a) throws InvalidParameter {
		return ((a % 4 == 0) && ((a % 100 != 0) || (a % 400 == 0)));
	}
}

