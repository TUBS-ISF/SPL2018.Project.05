
aspect Win {
	
	after() : execution(* Main.loadDetail(..)) {
		System.out.println("[Feature] OS ...");
		System.out.println("Windows OS, computer operating system (OS) developed by Microsoft Corporation to run personal computers (PCs).");
	}
	
	after() : execution(* Main.detectOS(..)) {
		System.out.println("Windows 7");
	}
	
	after() : execution(* Main.detectOSVersion(..)) {
		System.out.println("Home");
	}
	
}
