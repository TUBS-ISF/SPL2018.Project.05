
aspect Mac {
	
	after() : execution(* Main.loadDetail(..)) {
		System.out.println("[Feature] OS ...");
		System.out.println("Mac OS is the computer operating system for Apple Computer's Macintosh line of personal computers and workstations.");
	}
	
	after() : execution(* Main.detectOS(..)) {
		System.out.println("Mac OS X");
	}
	
	after() : execution(* Main.detectOSVersion(..)) {
		System.out.println("10.10.5");
	}
	
}
