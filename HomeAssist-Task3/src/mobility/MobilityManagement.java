package mobility;

public class MobilityManagement {

	public static void initialize() {
		//#ifdef Stationary
		StationaryInit();
		//#endif
		//#ifdef Wheeled
//@		WheeledInit();
		//#endif
		//#ifdef Legged
//@		LeggedInit();
		//#endif
	}
	
	//#ifdef Stationary
	private static void StationaryInit() {
		System.out.println("*** Stationary init");
	}
	//#endif
	
	//#ifdef Wheeled
//@	private static void WheeledInit() {
//@		System.out.println("*** Wheeled init");
//@		
//@	}
	//#endif
	
	//#ifdef Legged
//@	private static void LeggedInit() {
//@		System.out.println("*** Legged init");
//@		
//@	}
	//#endif
}
