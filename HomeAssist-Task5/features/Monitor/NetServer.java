
public class NetServer {
	
	private static void routePath(HttpServer serv) {
		original(serv);
		serv.createContext("/status", new Monitor.StatusHandler());
	}
	
}
