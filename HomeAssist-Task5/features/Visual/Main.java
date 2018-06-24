
public class Main {
	
	private static void loadDetail() {
		original();
		System.out.println("[Feature] Visual ...");
		System.out.println("Show on screen");
	}
	
	private static void detectVisual() {
		System.out.println("Visual: ture");
	}
	
	private static void runVisual() {
		new Visual().showVisual(actObj);
	}
	
}
