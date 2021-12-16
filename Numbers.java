import java.util.ArrayList;
import java.util.Collections;

public class Numbers {
	
	/**
	 *numbers	ArrayList vom Typen Integer um die Nummern zu speichern
	 * 
	 */
	ArrayList<Integer> numbers = new ArrayList<Integer>();

	/**
	 * Mit der set Methode werden die Zahlen gesetzt
	 * 
	 * @param	a	erste Zahl
	 * @param	b	zweite Zahl
	 * @param	c	dritte Zahl
	 * @param	d	vierte Zahl
	 * @param	e	fünfte Zahl
	 * 
	 */
	public void set(int a, int b, int c, int d, int e) {
		
		numbers.add(a);
		numbers.add(b);
		numbers.add(c);
		numbers.add(d);
		numbers.add(e);
		
	}
	
	/**
	 * Mit der get Methode erhält man die Werte aus numbers
	 * 
	 * @return	n	int[] mit den Werten
	 * 
	 */
	public int[] get() {
		
		int n[] = new int[5];
		
		for (int i = 0; i < numbers.size(); i++) {
			n[i] = numbers.get(i);
		}
		
		return n;
		
	}
	
	/**
	 * Mit der sum Methode erhält man die Summe aller Zahlen aus numbers
	 * 
	 * @return	sum	int mit dem Ergebnis
	 * 
	 */
	public int sum() {
		
		int sum = 0;
		
		for (int i = 0; i < numbers.size(); i++) {
			sum += numbers.get(i);
		}
		
		return sum;
		
	}
	
	/**
	 * Mit der min Methode erhält man den geringsten Wert aus numbers
	 * 
	 * @return	int mit dem Ergebnis
	 * 
	 */
	public int min() {
		
		return Collections.min(numbers);
		
	}
	
	/**
	 * Mit der min Methode erhält man den höchsten Wert aus numbers
	 * 
	 * @return	int mit dem Ergebnis
	 * 
	 */
	public int max() {
		
		return Collections.max(numbers);
		
	}
	
	/**
	 * Mit der middlevalue Methode erhält man den Mittelwert der Zahlen aus numbers
	 * 
	 * @return	int mit dem Ergebnis
	 * 
	 */
	public double middlevalue() {
		
		double middlevalue = 0;
		
		for (int i = 0; i < numbers.size(); i++) {
			middlevalue += numbers.get(i);
		}
		
		return middlevalue /= numbers.size();
		
	}
	
	/**
	 * Mit der change Methode kann eine Zahl geändert werden
	 * 
	 * @param	x	Position des zu ändernden Wertes
	 * @param	y	Neuer Wert
	 * 
	 */
	public void change(int x, int y) {
		
		numbers.set(x, y);
		
	}
	
}
