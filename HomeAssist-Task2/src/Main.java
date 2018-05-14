import java.awt.Container;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JFrame;

import properties.PropertyManager;

public class Main {
	
	private static final String STATIONARY = "Stationary";
	private static final String WHEELED = "Wheeled";
	private static final String LEGGED = "Legged";

	private static void showVisual() {
		JFrame win = new JFrame("MainWin");
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// layout
		//Container cont = win.getContentPane();

		win.setSize(200, 100);
		win.setVisible(true);
	}

	public static void main(String[] args) {
		
		Locale locale = new Locale("en", "US");
		boolean visual = false;
		
		//System.out.println(args[0]);
		if(args.length >= 2) {
			if( "-l".equals(args[0]) ) {
				if( "en".equals(args[1]) ) {
					locale = new Locale("en", "US");
				} else if( "de".equals(args[1]) ) {
					locale = new Locale("de", "DE");
				} else if( "zh".equals(args[1]) ) {
					locale = new Locale("zh", "CN");
				} else {
					locale = new Locale("en", "US");
				}
			}
		}
		
		if(args.length >= 3) {
			if( "-v".equals(args[2]) ) {
				visual = true;
			}
		}
		
		// Starting
		
		System.out.println("HomeAssist is starting ... ...");
		
		System.out.println("Detecting configuration ... ...");
		
		System.out.print("Locale: ");
		System.out.print(locale.getLanguage());
		System.out.print("\n");
		
		System.out.print("Visual: ");
		if(visual) {
			System.out.print("true");
		} else {
			System.out.print("false");
		}
		System.out.print("\n");
		
		System.out.print("Mobility: ");
		if(PropertyManager.getProperty(STATIONARY)) {
			System.out.print(STATIONARY);
		} else if(PropertyManager.getProperty(WHEELED)) {
			System.out.print(WHEELED);
		} else if(PropertyManager.getProperty(LEGGED)) {
			System.out.print(LEGGED);
		} else {
			System.out.print("Unknown");
		}
		System.out.print("\n");
		
		// Locale locale = new Locale("de", "DE");
		ResourceBundle res = ResourceBundle.getBundle("locale.ha", locale);
		System.out.println(res.getString("hello"));
		System.out.println(res.getString("grus"));
			
		//visual = true;
		if(visual) {
			showVisual();
		}
		
	}

}
