import java.util.Scanner;

public class Helper {
	
	private static Scanner in = new Scanner(System.in);

	/**
	 * inputString Methode wird benutzt um Strings einzulesen
	 * 
	 * @return	s
	 * 
	 */
	public String inputString() {
		
		String s = "";
		
		try {
			s = in.nextLine();
		} catch (Exception e) {
			s = inputString();
		}
		
		return s;
		
	}
	
	/**
	 * inputInt Methode wird benutzt um ints einzulesen
	 * 
	 * @return	i
	 * 
	 */
	public int inputInt() {
		
		int i = 0;
		
		try {
			i = in.nextInt();
		} catch (Exception e) {
			i = inputInt();
		}
		
		return i;
		
	}
	
	/**
	 * showMenu Methode wird benutzt um das Menü anzuzeigen
	 * 
	 */
	public void showMenu() {
		
		System.out.println(" ____ ____ ____ ____ ____ ____ ____ \r\n" + 
				"||N |||U |||M |||B |||E |||R |||S ||\r\n" + 
				"||__|||__|||__|||__|||__|||__|||__||\r\n" + 
				"|/__\\|/__\\|/__\\|/__\\|/__\\|/__\\|/__\\|");
		
		System.out.println("\nOptionen:\n");
		System.out.println("    (a)    Zahlen eingeben");
		System.out.println("    (b)    Ausgabe der Zahlen");
		System.out.println("    (c)    Summe der eingegebenen Zahlen berechnen");
		System.out.println("    (d)    Minimum und Maximum der eingegebenen Zahlen berechnen");
		System.out.println("    (e)    Mittelwert der eingegebenen Zahlen berechnen");
		System.out.println("    (f)    Zahlen verändern\n");
		System.out.println("    (g)    Programmende\n");
		
	}
	
}
