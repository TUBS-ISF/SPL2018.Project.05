package locale;

import java.util.Locale;

import plugindef.portLocale;

public class EnPackage implements portLocale {
	
	public static EnPackage load() {
		System.out.println("loading EnPackage ...");
		return new EnPackage();
	}
	
	@Override
	public Locale getLocale() {
		return new Locale("en", "US");
	}
	
	@Override
	public String getDescription() {
		return "Language Package - English";
	}
	
}