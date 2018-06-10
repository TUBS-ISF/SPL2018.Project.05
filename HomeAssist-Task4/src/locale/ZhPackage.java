package locale;

import java.util.Locale;

import plugindef.portLocale;

public class ZhPackage implements portLocale {
	
	public static ZhPackage load() {
		System.out.println("loading ZhPackage ...");
		return new ZhPackage();
	}
	
	@Override
	public Locale getLocale() {
		return new Locale("zh", "CN");
	}
	
	@Override
	public String getDescription() {
		return "Language Package - Chinese";
	}
	
}