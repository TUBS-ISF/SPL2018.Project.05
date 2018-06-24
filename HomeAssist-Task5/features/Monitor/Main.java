
public class Main {
	
	private static void loadDetail() {
		original();
		System.out.println("[Feature] Monitor ...");
		System.out.println("Monitoring the status.");
	}
	
	private static void runMonitor() {
		new Monitor(actObj);
	}
}
