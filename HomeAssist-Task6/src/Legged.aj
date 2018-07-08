
aspect Legged {
	
	private static final String LEGGED = "Legged";
	
	after() : execution(* Main.loadDetail(..)) {
		System.out.println("[Feature] Legged ...");
		Main.curMobility = LEGGED;
	}
	
	after() : execution(* Main.detectMobility(..)) {
		System.out.println(Main.curMobility);
	}
	
}
