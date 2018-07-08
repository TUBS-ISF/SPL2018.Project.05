
aspect Stationary {
	
	private static final String STATIONARY = "Stationary";
	
	after() : execution(* Main.loadDetail(..)) {
		System.out.println("[Feature] Stationary ...");
		Main.curMobility = STATIONARY;
	}
	
	after() : execution(* Main.detectMobility(..)) {
		System.out.println(Main.curMobility);
	}
	
}
