import java.util.Locale;

aspect En {
	
	after() : call(* Main.loadDetail(..)) {
		System.out.println("[Feature] EnPackage ...");
		Main.locale = new Locale("en", "US");
		System.out.println("Language Package - English");
	}
	
	after() : execution(* Main.detectLocale(..)) {
		System.out.println(Main.locale.getLanguage());
	}
	
}
