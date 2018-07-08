import java.awt.Point;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class MonitorOp {
	
	public static ActivityControl owner;
	
	public MonitorOp(ActivityControl app) {
		MonitorOp.owner = app;
	}
	
	static class StatusHandler implements HttpHandler {
	    @Override
	    public void handle(HttpExchange t) throws IOException {
	    	String response;
	    	Point p;
	    	if(MonitorOp.owner != null) {
	    		p = MonitorOp.owner.getPoint();
	    		response = "Current Location: (" + p.x + ", " + p.y + ")";
	    	} else {
	    		response = "Current Location: " + "Undefined";
	    	}
	        t.sendResponseHeaders(200, response.length());
	        OutputStream os = t.getResponseBody();
	        os.write(response.getBytes());
	        os.close();
	    }
	}
	
}
