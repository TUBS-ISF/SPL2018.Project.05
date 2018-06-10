package locale;

import java.util.Locale;

import plugindef.portLocale;

public class DePackage implements portLocale {
	
	public static DePackage load() {
		System.out.println("loading DePackage ...");
		return new DePackage();
	}
	
	@Override
	public Locale getLocale() {
		return new Locale("de", "DE");
	}
	
	@Override
	public String getDescription() {
		return "Language Package - Deutsch";
	}
	
}