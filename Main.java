
public class Main {
	
	/**
	 * 	nums	Instanz der Numbers Klasse
	 * 
	 */
	private static Numbers nums = new Numbers();
	
	private static Helper h = new Helper();

	/**
	 * In der main Methode wird das Programm ausgeführt
	 * 
	 * @param	args	String[] für Argumente beim Programmstart
	 * 
	 */
	public static void main(String[] args) {
		
		h.showMenu();
		
		System.out.print("> ");
		String cmd = h.inputString();
		
		if (cmd.equals("a")) {
			
			System.out.println("Erste Zahl: ");
			int a = h.inputInt();
			System.out.println("Zweite Zahl: ");
			int b = h.inputInt();
			System.out.println("Dritte Zahl: ");
			int c = h.inputInt();
			System.out.println("Vierte Zahl: ");
			int d = h.inputInt();
			System.out.println("Fünfte Zahl: ");
			int e = h.inputInt();
			
			nums.set(a, b, c, d, e);
			
			System.out.println("Press Enter to continue to main menu...");
			h.inputString();
			
		} else if (cmd.equals("b")) {
			
			for (int i = 0; i < nums.get().length; i++) {
				
				System.out.println(i + 1 + ". Zahl: " + nums.get()[i]);
				
			}
			
			System.out.println("Press Enter to continue to main menu...");
			h.inputString();
			
		} else if (cmd.equals("c")) {
			
			System.out.println("Summe der eingegeben Zahlen: " + nums.sum());
			
			System.out.println("Press Enter to continue to main menu...");
			h.inputString();
			
		} else if (cmd.equals("d")) {
			
			System.out.println("Minimum: " + nums.min());
			System.out.println("Maximum: " + nums.max());
			
			System.out.println("Press Enter to continue to main menu...");
			h.inputString();
			
		} else if (cmd.equals("e")) {
			
			System.out.println("Mittelwert: " + nums.middlevalue());
			
			System.out.println("Press Enter to continue to main menu...");
			h.inputString();
			
		} else if (cmd.equals("f")) {
			
			System.out.print("Die wievielte Zahl möchten Sie ändern? ");
			int p = h.inputInt() - 1;
			System.out.println("Die " + (p + 1) + ". Zahl ist aktuell " + nums.get()[p] + ". Geben Sie bitte einen neuen Wert ein: ");
			int n = h.inputInt();
			
			nums.change(p, n);
			
			System.out.println("Press Enter to continue to main menu...");
			h.inputString();
			
		} else if (cmd.equals("g")) {
			
			System.exit(0);
			
		} else {
			
			System.out.println("Befehl nicht erkannt. Überprüfen Sie ihre Rechtsschreibung und versuchen Sie es erneut.");
			
		}
		
		main(args);
		
	}

}
