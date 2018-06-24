import java.util.Locale;

public class Main {
	
	private static void loadDetail() {
		original();
		System.out.println("[Feature] ZhPackage ...");
		locale = new Locale("zh", "CN");
		System.out.println("Language Package - Chinese");
	}
	
	private static void detectLocale() {
		original();
		System.out.println(locale.getLanguage());
	}
	
}
