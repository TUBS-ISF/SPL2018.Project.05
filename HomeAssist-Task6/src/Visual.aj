
aspect Visual {
	
	after() : execution(* Main.loadDetail(..)) {
		System.out.println("[Feature] Visual ...");
		System.out.println("Show on screen");
	}
	
	after() : execution(* Main.detectVisual(..)) {
		System.out.println("Visual: ture");
	}
	
	after() : execution(* Main.runVisual(..)) {
		new VisualOp().showVisual(Main.actObj);
	}
}
