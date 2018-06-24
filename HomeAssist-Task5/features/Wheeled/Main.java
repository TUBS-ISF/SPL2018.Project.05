
public class Main {
	
	private static final String WHEELED = "Wheeled";
	
	private static void loadDetail() {
		original();
		System.out.println("[Feature] Wheeled ...");
		curMobility = WHEELED;
	}
	
	private static void detectMobility() {
		original();
		System.out.println(curMobility);
	}
	
}
