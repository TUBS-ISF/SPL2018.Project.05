
aspect Internet {
	
	after() : execution(* Main.loadDetail(..)) {
		System.out.println("[Feature] Internet ...");
		System.out.println("Start a Internet Server");
	}
	
	after() : execution(* Main.runNetServer(..)) {
		new NetServer();
	}
}
