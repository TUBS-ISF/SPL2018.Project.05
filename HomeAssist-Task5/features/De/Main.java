import java.util.Locale;

public class Main {
	
	private static void loadDetail() {
		original();
		System.out.println("[Feature] DePackage ...");
		locale = new Locale("de", "DE");
		System.out.println("Language Package - Deutsch");
	}
	
	private static void detectLocale() {
		original();
		System.out.println(locale.getLanguage());
	}
	
}
