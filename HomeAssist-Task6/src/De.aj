import java.util.Locale;

aspect De {
	
	after() : call(* Main.loadDetail(..)) {
		System.out.println("[Feature] DePackage ...");
		Main.locale = new Locale("de", "DE");
		System.out.println("Language Package - Deutsch");
	}
	
	after() : execution(* Main.detectLocale(..)) {
		System.out.println(Main.locale.getLanguage());
	}
	
}
