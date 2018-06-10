import java.util.Locale;
import java.util.ResourceBundle;

//import java.awt.Container;

import activity.ActivityControl;
import locale.DePackage;
import locale.EnPackage;
import locale.ZhPackage;
import mobility.MobilityManagement;
import plugindef.portActivity;
import plugindef.portLocale;
import plugindef.portOS;
import plugindef.portVisual;
import visual.Visual;
import osinfo.LinuxOS;
import osinfo.MacOS;
import osinfo.WinOS;
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

	/* for Plug-ins */
	private static portOS osObj;
	private static portLocale localeObj;
	private static portVisual visualObj;
	private static portActivity actObj;
	
	
	/* Main */
	public static void main(String[] args) {
	
		/* Parameter: Locale */
//		if(args.length >= 2) {
//			if( "-l".equals(args[0]) ) {
//				if( "en".equals(args[1]) ) {
//					locale = new Locale("en", "US");
//				} else if( "de".equals(args[1]) ) {
//					locale = new Locale("de", "DE");
//				} else if( "zh".equals(args[1]) ) {
//					locale = new Locale("zh", "CN");
//				} else {
//					locale = new Locale("en", "US");
//				}
//			}
//		}
//		res = ResourceBundle.getBundle("locale.ha", locale);
		
		/* Parameter: Visual */
//		if(args.length >= 3) {
//			if( "-v".equals(args[2]) ) {
//				curVisual = true;
//			}
//		}
		
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
		
		/* loading Plug-ins *********/
		loadPlugins();
		
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
		if(visualObj != null) {
			visualObj.showVisual(actObj);
		}
		
	}
	
	/* load Plug-ins */
	private static void loadPlugins() {
		
		System.out.println("*** Loading Plug-ins ***");
		
		/* OS information */
		//osObj = WinOS.load();
		osObj = MacOS.load();
		//osObj = LinuxOS.load();		
		if(osObj != null) System.out.println(osObj.getDescription());
		
		/* Locale */
		//localeObj = EnPackage.load();
		//localeObj = ZhPackage.load();
		localeObj = DePackage.load();
		if(localeObj != null) {
			locale = localeObj.getLocale();
			System.out.println(localeObj.getDescription());
		}
		res = ResourceBundle.getBundle("locale.ha", locale);
		
		/* Visual */
		visualObj = Visual.load();
		if(visualObj != null) {
			curVisual = true;
			System.out.println(visualObj.getDescription());
		}
		
		/* ActivityControl */
		actObj = ActivityControl.load();
		if(actObj != null) System.out.println(actObj.getDescription());
		
		
		System.out.println("*** End of loading Plug-ins ***");
	}
	
	/* configDetect */
	private static void configDetect() {
		
		System.out.println("*** Detecting configuration ***");
		
		/* OS */
		System.out.print("OS: ");
		if(osObj != null)
			System.out.print(osObj.getOSName());
		else
			System.out.print("Unknown");
		System.out.print("\n");
		/* OS Version */
		System.out.print("OS Version: ");
		if(osObj != null)
			System.out.print(osObj.getOSVersion());
		else
			System.out.print("Unknown");
		System.out.print("\n");
		
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

}
