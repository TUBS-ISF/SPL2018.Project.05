import java.util.Locale;
import java.util.ResourceBundle;

//import java.awt.Container;
import javax.swing.JFrame;

import mobility.MobilityManagement;
//#ifdef Projection
//@import visual.ProjectionManagement;
//#endif

public class Main {
	
	private static final String STATIONARY = "Stationary";
	private static final String WHEELED = "Wheeled";
	private static final String LEGGED = "Legged";
	
	/* Global: Locale */
	private static Locale locale = new Locale("en", "US");
	private static ResourceBundle res;
	/* Global: Visual */
	private static boolean curVisual = false;
	/* Global: Mobility */
	private static String curMobility = "Unknown";

	
	/* Main */
	public static void main(String[] args) {
	
		/* Parameter: Locale */
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
		res = ResourceBundle.getBundle("locale.ha", locale);
		
		/* Parameter: Visual */
		if(args.length >= 3) {
			if( "-v".equals(args[2]) ) {
				curVisual = true;
			}
		}
		/* (Override) Property: Visual */
		//#ifdef Visual
		curVisual = true;
		//#endif
		
		/* Property: Mobility */
		//#ifdef Stationary
		curMobility = STATIONARY;
		//#endif
		//#ifdef Wheeled
//@		curMobility = WHEELED;
		//#endif
		//#ifdef Legged
//@		curMobility = LEGGED;
		//#endif

		/* ******************************************* */
		
		/* Starting */
		System.out.println("HomeAssist is starting ... ...");
		
		/* Detecting */
		configDetect();
		
		/* Initializing */
		//#ifdef Projection
//@		ProjectionManagement.initialize();
		//#endif
		MobilityManagement.initialize();
		
		/* Welcome */
		System.out.print(res.getString("hello") + ", ");
		System.out.println(res.getString("grus") + " !");
		
		CommandLoop tdCmd = new CommandLoop();
		tdCmd.start();
			
		/* Visual */
		/*
		if(curVisual) {
			showVisual();
		}
		*/
		/* (Override) */
		//#ifdef Visual
		showVisual();
		//#endif
		
	}
	
	/* configDetect */
	private static void configDetect() {
		
		System.out.println("*** Detecting configuration ***");
		
		/* Locale */
		System.out.print("Locale: ");
		System.out.print(locale.getLanguage());
		System.out.print("\n");
		
		/* Visual */
		System.out.print("Visual: ");
		System.out.print(curVisual);
		System.out.print("\n");
		
		/* Mobility */
		System.out.print("Mobility: ");
		System.out.print(curMobility);
		System.out.print("\n");
		
		System.out.println("*** End of Detecting ***");
		
	}
	
	/* showVisual */
	//#ifdef Visual
	private static void showVisual() {
		JFrame win = new JFrame("MainWin");
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/* layout */
		//Container cont = win.getContentPane();
		
		/* Event */
		EventControl ec = new EventControl();
		win.add(ec);
		win.addKeyListener(ec);

		win.setSize(500, 400);
		win.setVisible(true);
	}
	//#endif

}
