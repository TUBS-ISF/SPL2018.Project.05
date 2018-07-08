import java.util.Locale;

aspect En {
	
	after() : call(* Main.loadDetail(..)) {
		System.out.println("[Feature] ZhPackage ...");
		Main.locale = new Locale("zh", "CN");
		System.out.println("Language Package - Chinese");
	}
	
	after() : execution(* Main.detectLocale(..)) {
		System.out.println(Main.locale.getLanguage());
	}
	
}
