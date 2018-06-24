import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
	
	/* System Basic Setting ******/
	
	/* Global: Locale */
	private static Locale locale = new Locale("en", "US"); // Default
	private static ResourceBundle res;
	/* Global: Visual */
//	private static boolean curVisual = false;
	/* Global: Mobility */
	private static String curMobility = "Unknown"; // Default
	
	/* for Features */
	private static ActivityControl actObj = null;
//	private static portMonitor monObj = null;
	
	/* Main */
	public static void main(String[] args) {

		/* ******************************************* */
		
		/* Starting */
		System.out.println("HomeAssist is starting ... ...");
		
		/* loading Plug-ins *********/
		loadPlugins();
		
		/* Detecting */
		configDetect();
		
		/* Welcome */
		System.out.print(res.getString("hello") + ", ");
		System.out.println(res.getString("grus") + " !");
		
		runVisual();
		
		/* Monitor */
		// *** http://localhost:8080/status *** ///
		runMonitor();
		
	}
	
	/* load Plug-ins */
	private static void loadPlugins() {
		System.out.println("*** Feature Description ***");
		loadDetail();
		res = ResourceBundle.getBundle("locale.ha", locale);
		System.out.println("*** End of Feature Description ***");
	}
	
	private static void loadDetail() {
	}
	
	/* configDetect */
	private static void configDetect() {
		
		System.out.println("*** Detecting configuration ***");
		
		/* OS */
		detectOS();
		/* OS Version */
		detectOSVersion();

		/* Locale */
		detectLocale();
		
		/* Visual */
		detectVisual();
		
		/* Mobility */
		detectMobility();
		
		System.out.println("*** End of Detecting ***");
	}
	
	private static void detectOS() {
		System.out.print("OS: ");
	}
	
	private static void detectOSVersion() {
		System.out.print("OS Version: ");
	}
	
	private static void detectLocale() {
		System.out.print("Locale: ");
	}
	
	private static void detectVisual() {
	}
	
	private static void detectMobility() {
		System.out.print("Mobility: ");
	}
	
	
	private static void runVisual() {
	}
	
	private static void runMonitor() {
	}
}
