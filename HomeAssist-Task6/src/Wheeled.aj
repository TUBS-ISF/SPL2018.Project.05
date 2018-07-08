
aspect Wheeled {
	
	private static final String WHEELED = "Wheeled";
	
	after() : execution(* Main.loadDetail(..)) {
		System.out.println("[Feature] Wheeled ...");
		Main.curMobility = WHEELED;
	}
	
	after() : execution(* Main.detectMobility(..)) {
		System.out.println(Main.curMobility);
	}
	
}
