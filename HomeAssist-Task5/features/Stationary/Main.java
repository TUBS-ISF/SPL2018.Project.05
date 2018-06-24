
public class Main {
	
	private static final String STATIONARY = "Stationary";
	
	private static void loadDetail() {
		original();
		System.out.println("[Feature] Stationary ...");
		curMobility = STATIONARY;
	}
	
	private static void detectMobility() {
		original();
		System.out.println(curMobility);
	}
	
}
