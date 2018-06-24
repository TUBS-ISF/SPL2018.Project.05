import java.util.Locale;

public class Main {
	
	private static void loadDetail() {
		original();
		System.out.println("[Feature] EnPackage ...");
		locale = new Locale("en", "US");
		System.out.println("Language Package - English");
	}
	
	private static void detectLocale() {
		original();
		System.out.println(locale.getLanguage());
	}
	
}
