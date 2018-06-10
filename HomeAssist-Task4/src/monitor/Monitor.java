package monitor;

import plugindef.portActivity;
import plugindef.portMonitor;

import java.awt.Point;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class Monitor implements portMonitor {
	
	public static portActivity owner;
	
	private HttpServer server;
	
	public static Monitor load(portActivity app) {
		System.out.println("loading Monitor ...");
		return new Monitor(app);
	}
	
	public Monitor(portActivity app) {
		try {
			Monitor.owner = app;
			this.server = HttpServer.create(new InetSocketAddress(8080), 0);
			this.server.createContext("/status", new StatusHandler());
			this.server.setExecutor(null);
			this.server.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static class StatusHandler implements HttpHandler {
	    @Override
	    public void handle(HttpExchange t) throws IOException {
	    	String response;
	    	Point p;
	    	if(Monitor.owner != null) {
	    		p = Monitor.owner.getPoint();
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
	
	@Override
	public String getDescription() {
		return "Monitoring the status.";
	}
	
}
