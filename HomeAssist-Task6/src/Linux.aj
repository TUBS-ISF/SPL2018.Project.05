
aspect Linux {
	
	after() : execution(* Main.loadDetail(..)) {
		System.out.println("[Feature] OS ...");
		System.out.println("Linux is a community-developed Unix-like open source operating system that is supported on most major computer platforms.");
	}
	
	after() : execution(* Main.detectOS(..)) {
		System.out.println("Linux");
	}
	
	after() : execution(* Main.detectOSVersion(..)) {
		System.out.println("3.4");
	}
	
}
