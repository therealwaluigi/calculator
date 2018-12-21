package ch.bbw.calculator;

public class Calculator {
	
	public int summe(int zahl1, int zahl2){
		return zahl1+zahl2;
	}
	
	public int subtraction(int zahl1, int zahl2){
		return zahl1-zahl2;
	}
	
	protected int division(int zahl1, int zahl2){
		if(zahl2 == 0){
			throw new IllegalArgumentException("Zweite Zahl darf nicht 0 sein");
		}
		return zahl1/zahl2;
	}



	/**
	 * Private Methoden testet man nicht direkt.
	 * Man testet die Methode, in der die private Methode aufgerufen wird.
	 */
}
