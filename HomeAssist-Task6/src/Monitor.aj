import java.awt.event.KeyEvent;

import com.sun.net.httpserver.HttpServer;

aspect Monitor {
	
	after() : execution(* Main.loadDetail(..)) {
		System.out.println("[Feature] Monitor ...");
		System.out.println("Monitoring the status.");
	}
	
	after() : execution(* Main.runNetServer(..)) {
		new MonitorOp(Main.actObj);
	}
	
	void around(HttpServer serv) : execution(void NetServer.routePath(HttpServer)) && args(serv) {
		try {
			proceed(serv);
		} finally {
			serv.createContext("/status", new MonitorOp.StatusHandler());
		}
	}
}
