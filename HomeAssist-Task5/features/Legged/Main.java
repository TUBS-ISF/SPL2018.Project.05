
public class Main {
	
	private static final String LEGGED = "Legged";
	
	private static void loadDetail() {
		original();
		System.out.println("[Feature] Legged ...");
		curMobility = LEGGED;
	}
	
	private static void detectMobility() {
		original();
		System.out.println(curMobility);
	}
	
}
